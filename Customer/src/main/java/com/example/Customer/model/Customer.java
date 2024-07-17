package com.example.Customer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="customer")
public class Customer {
	
	@Id
	@Column(name = "customerId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	
	@Column(name = "customerName",nullable = false)
	private String customerName;
	
	@Column(name = "email",nullable = false,unique = true)
	private String email;
	
	@Column(name = "mobileNo",nullable = false,unique = true)
	private String mobileNo;
	
	@Column(name = "address",nullable = false)
	private String address;
	
	@Column(name = "password",nullable = false)
	private String password;
	
	
	

}
