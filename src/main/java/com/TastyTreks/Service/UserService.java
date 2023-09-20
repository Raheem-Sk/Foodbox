package com.TastyTreks.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.TastyTreks.Repository.UserRepository;
import com.TastyTreks.pojos.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public void UserSave(User u) {
		repo.save(u);
		
	}
	
	public List<User> GetAll(){
		return repo.findAll();
	}
	
	

	public ResponseEntity<?> login(User u) {
		User a = repo.findUser(u.getEmailId());
		if(a.getPassword().equals(u.getPassword())) {
			return ResponseEntity.ok(a);
		}
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
