package com.TastyTreks.Service;

import java.util.List;

import com.TastyTreks.Repository.ProductRepository;
import com.TastyTreks.pojos.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
@Autowired
private ProductRepository repo;

	public List<Products> Allproducts() {
		
		return repo.findAll();
	}

	public String Saveprodu(Products product) {
		repo.save(product);
		return "product save sucessfully";
	}
}
