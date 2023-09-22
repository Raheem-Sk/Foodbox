package com.TastyTreks.pojos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private int quantity;
	private float price;
	@OneToOne
	private Products product;
	
	
	public Cart(long id, int quantity, float price, Products product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	
	public Cart() {
		super();
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	
	
	
	
	
	
}