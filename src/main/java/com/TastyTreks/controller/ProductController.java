package com.TastyTreks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TastyTreks.Products;
import com.TastyTreks.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	

	@GetMapping("/allproducts")
	public List<Products> getAdminProducts() {

		return productService.Allproducts();
	}

	@PostMapping("/save")
	public String Saveproducts(@RequestBody Products pr ) {
		 return productService.Saveprodu(pr);
		
	}
}
