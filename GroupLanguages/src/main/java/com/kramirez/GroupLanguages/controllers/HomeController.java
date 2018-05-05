package com.kramirez.GroupLanguages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kramirez.GroupLanguages.models.Language;
import com.kramirez.GroupLanguages.services.LanguageService;

@Controller
public class HomeController {
	public LanguageService langserv;
	public HomeController(LanguageService langserv) {
		this.langserv = langserv;
	}
	@RequestMapping("/")
	public String main() {
		return "redirect:/languages";
	}
	@RequestMapping("/languages")
	public String index(@ModelAttribute("language") Language language, Model model) {
		model.addAttribute("languages", langserv.allLanguages());
		return "languages";
	}
	@RequestMapping("/languages/edit/{id}")
	public String editLanguage(@PathVariable("id") Long id, Model model) {
		Language language = langserv.findLanguageById(id);
		if(language!=null) {
			model.addAttribute("language", language);
			return "editLang";
		}else {
			return "redirect:/languages";
		}
		
	}
	   @PostMapping("/languages/new")
	    public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
	        if (result.hasErrors()) {
	            return "languages";
	        }else{
	        	langserv.addLanguage(language);
	            return "redirect:/languages";
	        }
	    }
		@RequestMapping(value="/languages/delete/{id}")
	    public String destroyLanguage(@PathVariable("id") Long id) {
	        langserv.destroyLanguage(id);
	        return "redirect:/languages";
	    }
		@RequestMapping("/languages/{index}")
	    public String findLanguageByIndex(@PathVariable("id") Long id, Model model) {
	        model.addAttribute("language", langserv.findLanguageById(id));
	        return "language";
	    }
}

