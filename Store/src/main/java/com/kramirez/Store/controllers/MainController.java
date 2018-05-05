package com.kramirez.Store.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kramirez.Store.services.CategoryService;
import com.kramirez.Store.services.ProductService;

@Controller
public class MainController {
	private final ProductService productserv;
	private final CategoryService catserv;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	public MainController(ProductService productserv, CategoryService catserv) {
		this.catserv = catserv;
		this.productserv = productserv;
	}
	
	@RequestMapping("/")
	public String dashboard() {
		return "dashboard";
	}
}
