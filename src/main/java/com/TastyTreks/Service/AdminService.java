package com.TastyTreks.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.TastyTreks.Repository.AdminRepository;
import com.TastyTreks.pojos.Admin;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository adminRepository;

	public void createAccount(Admin admin) {
		adminRepository.save(admin);
	}

	public ResponseEntity<?> login(Admin admin) {
		Admin a=adminRepository.findByCategory(admin.getEmailId());
		if(a.getPassword().equals(admin.getPassword())) {
			return ResponseEntity.ok(a);
		}
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
	
}
