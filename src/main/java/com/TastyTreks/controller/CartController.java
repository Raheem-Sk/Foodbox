package com.TastyTreks.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.TastyTreks.Service.CartService;
import com.TastyTreks.pojos.Cart;
import com.TastyTreks.pojos.Products;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Cart")
public class CartController {
	@Autowired
	CartService cartService;
	
	@PostMapping("/Add")
	public void addtocart(@RequestBody Products product) {
		System.out.println(product.getPrice());
		Cart cart=new Cart();
		cart.setQuantity(1);
		cart.setPrice(product.getPrice());
		cart.setProduct(product);
		 cartService.addToCart(cart);
		
		
	}
	
	@GetMapping("/ShowProducts")
	public List<Cart> getcart()
	{
		return cartService.getcart();
		
	}
	
	@PutMapping("/Update/{id}")
	public Cart updatecart(@RequestBody Cart cart,@PathVariable long id) 
	{
		
		return cartService.updatecart(cart,id);
		
	}
	
	@PostMapping("/Product/{id}")
	public Cart productbyid(@PathVariable long id) {
		
		return cartService.productbyid(id);
	}
	
	@DeleteMapping("/Delete/{id}")
	public String deleteproincart(@PathVariable long id) {
	 cartService.deleteproincart(id);
	 return "successfully deleted";
	}
	
	@DeleteMapping("/deleteAll")
	public String deletecart() {
		return cartService.deletecart();		
	}
	
}