package com.TastyTreks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TastyTreks.Service.UserService;
import com.TastyTreks.pojos.User;

@RestController
@CrossOrigin(origins="*")
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
	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody User u){
		return (ResponseEntity<User>) uServe.login(u) ;
		
	}
	
	//test
	@GetMapping("/All")
	public List<User> get(){
		return uServe.GetAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUserbyId(@PathVariable Long id){
		System.out.println("called");
		return uServe.getUserbyId(id);
	}
	
	@PutMapping("/update/{id}")
	public User update(@PathVariable long id ,@RequestBody User  ur) {
		return uServe.updateuser(id,ur);
	}
		
	@PutMapping("/wallet/{id}")
	public void wallet(@PathVariable long id ,@RequestBody float ur) {
		 uServe.updatewallet(id,ur);
		
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable long id) {
		uServe.deleteuser(id);
		return "successfully deleted";
	}
	
	@PutMapping("/changepassword/{id}")
	public String changepassword(@PathVariable long id ,@RequestBody String  pass) {
		return uServe.changepassword(id,pass);
	}
}
