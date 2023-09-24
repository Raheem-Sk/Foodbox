package com.TastyTreks.pojos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String cuisines;
	private String description;
	private float price;
	private float offers;
	private String avail;
	private String imagepath;

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuisines() {
		return cuisines;
	}

	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getOffers() {
		return offers;
	}

	public void setOffers(float offers) {
		this.offers = offers;
	}

	public String getAvail() {
		return avail;
	}

	public void setAvail(String avail) {
		this.avail = avail;
	}

}
