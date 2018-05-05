package com.kramirez.JavaSBB.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kramirez.JavaSBB.models.User;
import com.kramirez.JavaSBB.services.UserService;



@Controller
public class MainController {
	private final UserService userserv;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	public MainController(UserService userserv) {
		this.userserv = userserv;
	}
	@RequestMapping("/")
	public String home(@ModelAttribute("user") User user, Model model) {
		
		return "login";
	}
	@PostMapping("/register/user")
	public String user_handler(HttpSession http, @RequestParam("c_password") String c_password, @Valid @ModelAttribute("user") User user, BindingResult result) {
		if(result.hasErrors()) {
			return "login";
		}else {
			userserv.createUser(user, c_password, http);
			if(http.getAttribute("user_id") !=null) {
				return "redirect:/dashboard";
			}else {
				return "login";
			}
			
		}
	}
	@PostMapping("/login/user")
	public String user_login(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession httpSession, Model model, RedirectAttributes redirectAttributes) {
		if(userserv.login(email, password, httpSession)) {
		return "redirect:/dashboard";
	}else {
		redirectAttributes.addFlashAttribute("error", "Invalid Credentials, Please try again.");
		return "redirect:/";
		}
	}
		@RequestMapping("/logout")
		public String logout(HttpSession httpSession) {
			httpSession.invalidate();
			return "redirect:/";
		}

	}
	
