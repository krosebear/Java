package com.kramirez.PortfolioAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class PortfolioAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioAssignmentApplication.class, args);
	}
	@RequestMapping("/")
	public String home() {
		return "forward:/index.html";
	}
	@RequestMapping("/about")
	public String aboutme() {
		return "forward:/aboutme.html";
	}
	@RequestMapping("/projectspage")
	public String portfolio() {
		return "forward:/projects.html";
	}
	
}
