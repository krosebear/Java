package com.kramirez.LearningPlatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/m/{chapter}/0553/{assignmentNumber}")
	public String mylessons(@PathVariable String chapter, 
			@PathVariable String assignmentNumber) {
		return "lessons";
	}
	@RequestMapping("/m/{chapter}/0483/{assignmentNumber}")
	public String myassignments(@PathVariable String chapter, 
			@PathVariable String assignmentNumber) {
		return "assignments";
	}
}
