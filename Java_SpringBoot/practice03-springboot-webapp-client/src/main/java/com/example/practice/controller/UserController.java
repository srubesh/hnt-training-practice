package com.example.practice.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.practice.entities.Users;

@RestController
@RequestMapping("api/user")
@CrossOrigin
public class UserController {

	List<Users> userList = new ArrayList<Users>();
	@GetMapping(value="/demo")	
	public @ResponseBody ResponseEntity<?> getAllEmployees(){
		Map<String,Object> resultMap = new LinkedHashMap<>();
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/api/users";
		userList = (List<Users>) restTemplate.getForObject(url, List.class);
		
		if(!userList.isEmpty()) {
			resultMap.put("status",1);
			resultMap.put("data",userList);
			return new ResponseEntity<>(resultMap,HttpStatus.OK);
		}
		else {
			resultMap.clear();
			resultMap.put("status", 0);
			resultMap.put("data", userList);
			return new ResponseEntity<>(resultMap,HttpStatus.NOT_FOUND);
		}
		
	}
	
}
