package com.kramirez.DriversLicense.controllers;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kramirez.DriversLicense.models.License;
import com.kramirez.DriversLicense.models.Person;
import com.kramirez.DriversLicense.services.HomeService;


@Controller
public class HomeController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	private final HomeService homeserv;
	
	public HomeController(HomeService homeserv) {
		this.homeserv = homeserv;
	}
	@RequestMapping("/")
	public String index(@ModelAttribute("person") Person person, Model model, @ModelAttribute("license") License license) {
		model.addAttribute("person", homeserv.allPeople());
		model.addAttribute("license", homeserv.allLicenses());
		return "index";
	}
	@RequestMapping("/person/new")
	public String newPersonPage(@ModelAttribute("person") Person person, Model model) {
		return "addPerson";
	}
	
	@PostMapping("/createPerson")
	 public String addPerson(@Valid @ModelAttribute("person") Person person, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "createPerson";
		}else {
			homeserv.addPerson(person);
			return "redirect:/";
		}
	}
	@RequestMapping("/license/new")
	public String newLicensePage(@ModelAttribute("license") License license, Model model) {
		model.addAttribute("persons", homeserv.allPeople());
		return "addLicense";
	}
	@PostMapping("/createLicense")
	 public String addPerson(@Valid @ModelAttribute("license") License license, BindingResult result, Model model) {
		if (result.hasErrors()) {
			System.out.println(result);
			model.addAttribute("persons", homeserv.allPeople());
			return "redirect:/";
		}else {
			License lic = homeserv.addLicense(license);
			String personId = Long.toString(lic.getPerson().getId());
			return "redirect:/";
		}
	}
}
