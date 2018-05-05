package com.kramirez.Counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		
		if(count == null) {
			session.setAttribute("count", 0);
		} else {
			Integer currentCount = count + 1;
			session.setAttribute("count", currentCount);
		}
		
		return "index";
	}
	
	@RequestMapping("/mycount")
	public String counter() {
		return "counter";
	}
	
}
