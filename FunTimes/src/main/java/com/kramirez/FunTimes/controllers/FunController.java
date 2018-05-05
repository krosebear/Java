package com.kramirez.FunTimes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FunController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
