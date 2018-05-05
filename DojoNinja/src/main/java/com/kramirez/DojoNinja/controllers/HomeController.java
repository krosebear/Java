package com.kramirez.DojoNinja.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kramirez.DojoNinja.models.Dojo;
import com.kramirez.DojoNinja.models.Ninja;
import com.kramirez.DojoNinja.services.DojoService;
import com.kramirez.DojoNinja.services.NinjaService;

@Controller
public class HomeController {
	private final NinjaService ninjaserv;
	private final DojoService dojoserv;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	public HomeController(NinjaService ninjaserv,DojoService dojoserv) {
		this.ninjaserv = ninjaserv;
		this.dojoserv = dojoserv;
	}
	@RequestMapping("/")
	public String index(@ModelAttribute("dojo") Dojo dojo, Model model, @ModelAttribute("ninja") Ninja ninja) {
		model.addAttribute("dojo", dojoserv.allDojos());
		model.addAttribute("ninja", ninjaserv.allNinjas());
		return "index";
	}
	@RequestMapping("/dojo/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		return "newdojo";
	}
	@RequestMapping("/ninja/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoserv.allDojos());
		return "newninja";
	}
	@PostMapping("/dojo/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "newdojo";
		}else {
			dojoserv.addDojo(dojo);
			return "redirect:/";
		}
		
	}
	@PostMapping("/ninja/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result,  Model model) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "newninja";
		}else {
			ninjaserv.addNinja(ninja);
			return "redirect:/";
		}
	}
	@RequestMapping("/show/{id}")
	public String show(@PathVariable("id") Long id,  Model model) {
		model.addAttribute("dojo", dojoserv.findOne(id));
		return "show";
	}
}
