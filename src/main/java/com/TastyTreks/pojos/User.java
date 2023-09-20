package com.TastyTreks.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userID;
	
	private String userName;
	@Column (unique=true)
	private String emailId;
	
	private String password;
	@Column (unique=true)
	private long mobile;
	
	private String address;
	
	private float Wallet = 10000;
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long userID, String userName, String emailId, String password, long mobile, String address, float Wallet) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.Wallet = Wallet;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getWallet() {
		return Wallet;
	}

	public void setWallet(float wallet) {
		Wallet = wallet;
	}
	
	
	
	
	
}
