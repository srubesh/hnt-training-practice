package com.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// wait for request with path
@RequestMapping("/api/users")

public class UserController {

	@GetMapping()
	public List<String> getUsers(){
		return Arrays.asList("Hulk", "Spiderman", "Batman", "Wonder Woman");
	}

	@GetMapping("/greet")
	public String greet(){
		return "Welcome user";
	}
	@GetMapping("/greet/{name}")
	public String greet(@PathVariable String name){
		return "Welcome "+name;
	}
}
