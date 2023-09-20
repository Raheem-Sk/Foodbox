package com.TastyTreks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TastyTreks.Service.UserService;
import com.TastyTreks.pojos.User;

@RestController
public class UserController {
	
	@Autowired
	private UserService uServe;
	
	// Create an User 
	@PostMapping("/register")
	public void saveUser(@RequestBody User u) {
		 uServe.UserSave(u);
		
	}
	
		
	//Login user API
	@SuppressWarnings("unchecked")
	@GetMapping("/login")
	public ResponseEntity<User> login(@RequestBody User u){
		return (ResponseEntity<User>) uServe.login(u) ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//test
	@GetMapping("/All")
	public List<User> get(){
		return uServe.GetAll();
	}
}
