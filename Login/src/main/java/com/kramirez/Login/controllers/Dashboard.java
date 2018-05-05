package com.kramirez.Login.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kramirez.Login.services.UserService;

@Controller
public class Dashboard {
	
	private final UserService userserv;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	public Dashboard(UserService userserv) {
		this.userserv = userserv;
	}
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
}
