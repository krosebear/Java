package com.kramirez.JavaSBB.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kramirez.JavaSBB.models.User;
import com.kramirez.JavaSBB.services.UserService;

@Controller
public class DashController {
	private final UserService userserv;
	public DashController(UserService userserv) {
		this.userserv = userserv;
	}
	
	@RequestMapping("/dashboard")
	public String dash(HttpSession http, @ModelAttribute("user") User user, Model model) {
		String stringToConvert = String.valueOf(http.getAttribute("user_id"));
        Long convertedLong = Long.parseLong(stringToConvert);
		User use = userserv.findUser(convertedLong);
		model.addAttribute("user", use);
		return "dashboard";
	}

}
