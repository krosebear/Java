package com.kramirez.BeltReviewer.controllers;

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

import com.kramirez.BeltReviewer.models.Event;
import com.kramirez.BeltReviewer.models.User;
import com.kramirez.BeltReviewer.services.EventService;
import com.kramirez.BeltReviewer.services.UserService;

@Controller
public class DashController {
	private final UserService userserv;
	private final EventService eventserv;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	public DashController(UserService userserv, EventService eventserv) {
		this.userserv = userserv;
		this.eventserv = eventserv;
	}
	public User conv(HttpSession user) {
		String stringToConvert = String.valueOf(user.getAttribute("user_id"));
        Long convertedLong = Long.parseLong(stringToConvert);
        User convUser = userserv.findUser(convertedLong);
        return convUser;
	}
	@RequestMapping("/dashboard")
	public String dash(HttpSession http, @ModelAttribute("user") User user, Model model, @ModelAttribute("event") Event event) {
		model.addAttribute("user", conv(http));
		model.addAttribute("events", eventserv.findAll());
		return "dashboard";
	}
	@PostMapping("/add/event")
	public String eventHandler(HttpSession http, @Valid @ModelAttribute("event") Event event, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "redirect:/dashboard";
		}else {
			System.out.println(conv(http));
			eventserv.createEvent(event, conv(http));
			return "redirect:/dashboard";
		}
	}
	@RequestMapping("/delete/event/{id}")
	public String delEvent(@PathVariable("id") long id, Model model) {
		eventserv.destroyEvent(id);
		return "redirect:/dashboard";
	}
	@RequestMapping("/event/show/{id}")
	public String showLikes(@PathVariable("id") Long event, Model model) {
		model.addAttribute("event", eventserv.findOne(event));
		return "event";
	}
	
}
