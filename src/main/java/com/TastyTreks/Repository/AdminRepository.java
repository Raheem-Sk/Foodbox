package com.TastyTreks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.TastyTreks.pojos.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	@Query("Select a from Admin a where a.emailId= ?1")
	Admin findByCategory(String user);

	
}
