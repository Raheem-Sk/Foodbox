package com.TastyTreks.Service;

import java.util.List;

import com.TastyTreks.Repository.ProductRepository;
import com.TastyTreks.pojos.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {
	
@Autowired
private ProductRepository repo;

	public List<Products> Allproducts() {
		return repo.findAll();
	}

	public String saveprodu(Products product) {
		repo.save(product);
		return "product save sucessfully";
	}

	public Products updateproduct(long id, Products pr) {
		if(repo.findById(id).isPresent()) {
			Products p=repo.findById(id).get();
			p.setName(pr.getName());
			p.setPrice(pr.getPrice());
			p.setCuisines(pr.getCuisines());
			p.setDescription(pr.getDescription());
			p.setOffers(pr.getOffers());
			p.setAvail(pr.getAvail());
			p.setImagepath(pr.getImagepath());
			repo.save(p);
			return repo.findById(id).get();
		}
		return null;
	}

	public List<Products> deleteproduct(long id) {
		repo.deleteById(id);
		return repo.findAll();
	}

	public List<Products> productSearch(String s) {
		List<Products> pl=repo.productSearch(s);
		return pl;
	}
	
	public Products productSerach(long id) {
		return repo.findById(id).get();
	}

	public List<Products> productSearchbycusine(String s) {
		List<Products> pl=repo.productSearchbycusine(s);
		return pl;
	}
	
}
