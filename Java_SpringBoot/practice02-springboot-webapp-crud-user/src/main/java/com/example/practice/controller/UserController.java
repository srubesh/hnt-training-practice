package com.example.practice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.example.practice.entities.Users;
import com.example.practice.service.UserService;
import com.example.practice.utils.UserRoutings;

@RestController
@RequestMapping
@CrossOrigin
public class UserController {

	@Autowired
	private UserService service;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping(value = UserRoutings.GET_ALL)	
	public List<Users> getUsers(){
		return service.getUsers();
		//return null;
	}
	
	@GetMapping(value = UserRoutings.GET_BY_ID)
	public Users getUserById(@PathVariable int id) throws Exception{
		return service.getUserById(id);
//		return null;
	}
	
	@PostMapping(value = UserRoutings.SAVE_USER)
	public Users saveUser(@RequestBody Users user){
		return service.saveUser(user);
//		return null;
	}

	@DeleteMapping(value = UserRoutings.DELETE_USER)
	public Users deleteUserById(@PathVariable int id) throws Exception{
		return service.deleteUserById(id);
//		return null;
	}
	
	@PutMapping(value = UserRoutings.UPDATE_USER)
	public Users updateUser(@RequestBody Users u, @PathVariable int id) throws Exception{
		return service.updateUser(u, id);
//		return null;
	}
}
