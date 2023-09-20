package com.TastyTreks.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.TastyTreks.pojos.Products;

public interface  ProductRepository  extends JpaRepository<Products,Long>{
	
}


