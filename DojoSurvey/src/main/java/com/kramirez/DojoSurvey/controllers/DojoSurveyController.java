package com.kramirez.DojoSurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurveyController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/mydashboard")
	public String dash() {
		return "dashboard";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
    public String login(@RequestParam(value="name") String name, @RequestParam(value="dojolocation") String dojolocation, 
    		@RequestParam(value="favlanguage") String favlanguage, 
    		@RequestParam(value="comment") String comment, Model model) {
    		model.addAttribute("favlanguage", favlanguage);
    		model.addAttribute("name", name);
    		model.addAttribute("dojolocation", dojolocation);
    		model.addAttribute("comment", comment);
		return "dashboard";
	}
}
