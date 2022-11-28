package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.entities.User;
import com.example.practice.service.UserService;

@RestController
@RequestMapping("api/users")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping()	
	public List<User> getUsers(){
		return service.getUsers();
		//return null;
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) throws Exception{
		return service.getUserById(id);
//		return null;
	}
	
	@PostMapping()
	public User saveUser(@RequestBody User user){
		return service.saveUser(user);
//		return null;
	}

	@DeleteMapping("/{id}")
	public User deleteUserById(@PathVariable int id) throws Exception{
		return service.deleteUserById(id);
//		return null;
	}
	
	@PutMapping("/{id}")
	public User updateUser(@RequestBody User b, @PathVariable int id) throws Exception{
		return service.updateUser(b, id);
//		return null;
	}
}
