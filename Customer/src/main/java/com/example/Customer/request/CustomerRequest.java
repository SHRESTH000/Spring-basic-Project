package com.example.Customer.request;

import lombok.Data;

@Data
public class CustomerRequest {
	
	private long customerId;
	private String customerName;
	private String email;
	private String mobileNo;
	private String address;
	private String password;
	
	
	

}
