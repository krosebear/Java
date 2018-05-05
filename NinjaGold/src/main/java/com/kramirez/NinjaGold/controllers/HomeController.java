package com.kramirez.NinjaGold.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<String> messages = (ArrayList<String>) session.getAttribute("messages");
		if(gold==null) session.setAttribute("gold", 0);
		if(messages==null) session.setAttribute("messages", new ArrayList<String>());
		return "index";
	}
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String generateGold(HttpSession session, @RequestParam("building") String building) {
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<String> messages = (ArrayList<String>) session.getAttribute("messages");
		Random r = new Random();
		String msg = "";
		int gG = 0;
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy h:m a");
        String parsedDate = date.format(formatter);
        if(building.equals("farm")) {
        		gG = r.nextInt(11)+10;
        		msg = "You entered a farm and earned " + gG + " gold. " + parsedDate;
        }
        if(building.equals("cave")) {
    			gG = r.nextInt(4)+2;
    			msg = "You entered a cave and earned " + gG + " gold. " + parsedDate;
    }
        if(building.equals("house")) {
    			gG = r.nextInt(6)+5;
    			msg = "You entered a house and earned " + gG + " gold. " + parsedDate;
    }
        if(building.equals("casino")) {
    			gG = r.nextInt(101)-50;
    			if(gG < 0) {
    				msg = "You entered a casino and lost " + gG + " gold...Ouch. " + parsedDate;
    			}else {
    				msg = "You entered a casino and earned " + gG + " gold. " + parsedDate;
    			}
    			
    }
        messages.add(0, msg);
        gold += gG;
        session.setAttribute("messages", messages);
        session.setAttribute("gold", gold);
		return "redirect:/";
	}
	@RequestMapping("/reset")
	public String resetGame(HttpSession session) {
		session.setAttribute("gold", null);
		session.setAttribute("messages", null);
		return "redirect:/";
	}
}
