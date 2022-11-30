package com.example.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.entities.Users;
import com.example.practice.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<Users> getUsers(){
		return repo.findAll();
//		return null;
	}
	

	public Users getUserById(int id) throws Exception {
		
		Optional<Users> optional = repo.findById(id); 
		if(optional.isPresent()) {
			return optional.get();
		} 
		else {
			throw new Exception("Can not find user with id: "+id); 
		}
		 
//		return null;
	}
	

	public Users saveUser(Users user){
		return repo.save(user);
//		return null;
	}


	public Users deleteUserById(int id) throws Exception {
		
		Users user = getUserById(id); 
		if(user!=null) { 
			repo.delete(user); 
			return user; 
		} 
		else { 
			throw new Exception("Can not delete user with id: "+id); 
		}
		
//		return null;
	}
	

	public Users updateUser(Users u, int id) throws Exception{
//		User user = getUserById(id);
//		if(user!=null) {

		if(repo.existsById(id)) {
			u.setId(id); 
			return repo.save(u); 
		} 
		else { 
			throw new Exception("Can not update user with id: "+id); 
		}
 
		
//		return null;
	}

}
