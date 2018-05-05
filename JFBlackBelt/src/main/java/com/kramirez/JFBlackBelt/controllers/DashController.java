package com.kramirez.JFBlackBelt.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;
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
import org.springframework.web.bind.annotation.RequestParam;

import com.kramirez.JFBlackBelt.models.Idea;
import com.kramirez.JFBlackBelt.models.User;
import com.kramirez.JFBlackBelt.services.IdeaService;
import com.kramirez.JFBlackBelt.services.UserService;

@Controller
public class DashController {
	private final UserService userserv;
	private final IdeaService ideaserv;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	public DashController(UserService userserv, IdeaService ideaserv) {
		this.ideaserv = ideaserv;
		this.userserv = userserv;
	}
	@RequestMapping("/dashboard")
	public String dash(HttpSession http, @ModelAttribute("user") User user, @ModelAttribute("idea") Idea idea, Model model) {
//		System.out.println(http.getAttribute("user_id").getClass().getName());
//		model.addAttribute("idea", ideaserv.getAll());
		String stringToConvert = String.valueOf(http.getAttribute("user_id"));
        Long convertedLong = Long.parseLong(stringToConvert);
		User use = userserv.findUser(convertedLong);
		model.addAttribute("user", use);
		model.addAttribute("ideas", ideaserv.findOrdered());
		return "dashboard";
	}
	@PostMapping("/add/idea")
	public String create(HttpSession http, @Valid @ModelAttribute("idea") Idea idea, BindingResult result ) {
		if(result.hasErrors()) {
			return "dashboard";
		}else {
			String stringToConvert = String.valueOf(http.getAttribute("user_id"));
	        Long convertedLong = Long.parseLong(stringToConvert);
			User id = userserv.findUser(convertedLong);
			ideaserv.createIdea(idea, id);
			return "redirect:/dashboard";
		}
	}
	@PostMapping("/add/like")
	public String like(HttpSession http, @RequestParam("id") Long idea) {
		
			String stringToConvert = String.valueOf(http.getAttribute("user_id"));
	        Long convertedLong = Long.parseLong(stringToConvert);
			User id = userserv.findUser(convertedLong);
			
			ideaserv.createLike(idea, id);
			return "redirect:/dashboard";
		}
	@RequestMapping("/brightideas/{id}")
	public String showLikes(@PathVariable("id") Long idea, Model model) {
		model.addAttribute("idea", ideaserv.findOne(idea));
		return "show";
	}
	@RequestMapping("/user/{id}")
	public String showUser(@PathVariable("id") Long id, Model model) {
		User user = userserv.findUser(id);
		model.addAttribute("user", userserv.findUser(id));
//		System.out.println(user.getFirstName());
		return "showuser";
	}
	@RequestMapping("/deleteidea/{id}")
	public String deleteIdea(@PathVariable("id") Long id, Model model) {
		ideaserv.deleteId(id);
		return "redirect:/dashboard";
	}
}


