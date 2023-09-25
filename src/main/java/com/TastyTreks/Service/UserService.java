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
	
	public User  updateuser(long id, User ur) {
		if(repo.findById(id).isPresent()) {
			User  u=repo.findById(id).get();
			u.setUserName(ur.getUserName());
			u.setEmailId(ur.getEmailId());
			u.setMobile(ur.getMobile());
			u.setAddress(ur.getAddress());
			repo.save(u);
			
		}
		return repo.findById(id).get();
	}

	public void deleteuser(long id) {
		
		repo.deleteById(id);
	}

	public String changepassword(long id,String pass) {
		if(repo.findById(id).isPresent()) {
			User  ur=repo.findById(id).get();
			ur.setPassword(pass);
			repo.save(ur);
          return "password updated sucessfully";
		}
		
		return "password change failed to update";
	}

	public User getUserbyId(Long id) {
		
		return repo.findById(id).get();
	}

	public void updatewallet(long id, float ur) {
		if(repo.findById(id).isPresent()) {
			User  u=repo.findById(id).get();
			u.setWallet(ur);
			repo.save(u);
           
		}
		
		
	}

	
}
