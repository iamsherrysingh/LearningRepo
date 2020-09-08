package com.sherry.apistore.todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoApp {

	@GetMapping("/todoapp")
	private String sayHello() {
		return "Hello from To Do App";
	}
}
