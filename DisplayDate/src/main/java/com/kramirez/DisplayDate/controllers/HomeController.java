package com.kramirez.DisplayDate.controllers;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private static Date CurDate = new Date();
	private static SimpleDateFormat formatter;
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/mydate")
	public String date(Model model) {
		formatter = new SimpleDateFormat("EEEE, 'the ' d 'of' MMMM, yyyy");
		String formattedDate =  formatter.format(CurDate);
		model.addAttribute("date", formattedDate);
		return "date";
	}
	@RequestMapping("/mytime")
	public String time(Model model) {
		formatter = new SimpleDateFormat("hh:mm aa");
		String formattedDate =  formatter.format(CurDate);
		model.addAttribute("date", formattedDate);
		return "time";
	}
}
