package com.sherry.apistore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ToDoApp {
	
	@GetMapping("/")
	private String hello() {
		return "Hello from API Store";
	}

}
