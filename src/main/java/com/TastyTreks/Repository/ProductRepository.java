package com.TastyTreks.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.TastyTreks.pojos.Products;

public interface  ProductRepository  extends JpaRepository<Products,Long>{

	@Query("SELECT p FROM Products p WHERE p.name LIKE CONCAT('%', ?1, '%')")
	List<Products> productSearch(String s);
	
	@Query("SELECT p FROM Products p WHERE p.cuisines LIKE CONCAT('%', ?1, '%')")
	List<Products> productSearchbycusine(String s);
	
}


