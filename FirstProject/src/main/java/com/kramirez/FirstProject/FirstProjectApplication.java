package com.kramirez.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So Easy to just respond with strings";
	}
	
}