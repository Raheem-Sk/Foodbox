package com.TastyTreks.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Service;

import com.TastyTreks.Repository.CartRepository;
import com.TastyTreks.pojos.Cart;
@Service
public class CartService {
	@Autowired
	private CartRepository cartRepository;

	public String addToCart(Cart cart) {
		
		cartRepository.save(cart);
		return "successfully added";
	}

	public List<Cart> getcart() {
		
		return cartRepository.findAll() ;
	}

	public Cart updatecart(Cart cart, long id) {
		
		if (cartRepository.findById(id).isPresent()) {
			Cart c=cartRepository.findById(id).get();
			c.setPrice(cart.getPrice());
			c.setQuantity(cart.getQuantity());
			cartRepository.save(c);
		}
		return cartRepository.findById(id).get();
	}

	public Cart productbyid(long id) {
		
		return cartRepository.findById(id).get();
	}

	public void deleteproincart(long id) {
		
		 cartRepository.deleteById(id);
	}

	public String deletecart() {
		cartRepository.deleteAll();
		return "cart is Empty";
	}}