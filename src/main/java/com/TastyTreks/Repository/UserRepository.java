package com.TastyTreks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.TastyTreks.pojos.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	@Query("SELECT u FROM User u WHERE u.emailId = ?1")
	User findUser(String emailId);

	

	
}
