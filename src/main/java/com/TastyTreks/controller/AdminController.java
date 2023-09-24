package com.TastyTreks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TastyTreks.Service.AdminService;
import com.TastyTreks.pojos.Admin;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/register")
	public String createAccount(@RequestBody Admin admin) {
		adminService.createAccount(admin);
		return "sucessfull";
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Admin admin){
		return adminService.login(admin) ;
		
	}
	

}
