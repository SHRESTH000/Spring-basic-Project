package com.example.Customer.controller;


import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer.model.Customer;
import com.example.Customer.request.CustomerRequest;
import com.example.Customer.service.CustomerService;



@RestController
@RequestMapping("/cs/v1/customer")
public class CustomerController {
	
	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value = "/save")
	public ResponseEntity<?> createCustomer(@RequestBody CustomerRequest customerRequest) {
		
		logger.info("createCustomer API started");
		try {
			
			Customer customer=customerService.saveCustomer(customerRequest);
			logger.info("Customer saved Sucessfully and CreateCustomer API ended");
			return ResponseEntity.ok().body(customer);
			
		} catch (Exception e) {
			logger.error("Some Error occur , no Customer saved");
			return ResponseEntity.internalServerError().body("Customer is not Saved");

		
		}
		
	}
	
	@GetMapping(value = "/findall")
	public ResponseEntity<?> findAll() {
		logger.info("FindAll API is Started ");
		
		try {
			List<Customer> customerlist= customerService.getAllCustomer();
			logger.info("Customer is Found and FindAll API  is ended ");
			return ResponseEntity.ok().body(customerlist);
			
		} catch (Exception e) {

			logger.error("Some Error Occur No Customer is found");
			return ResponseEntity.internalServerError().body("No Customers is not Found ");
		}
		
	}
	
	@GetMapping(value = "/count")
	public ResponseEntity<?> countAllCustomer() {
		
		logger.info("CountAllCustomer API is started");
		
		try {
			
			long count=customerService.countAllCustomer();
			logger.info("ALL Customer is Counted and countAllCustomer API ended");
			return ResponseEntity.ok().body(count);
		} catch (Exception e) {

			logger.error(" some error occur ,No Customer is there");
			return ResponseEntity.internalServerError().body("Count is 0");
		
		}
	}
	@GetMapping(value = "/find/{customerId}")
	public ResponseEntity<?> findCustomerById(@PathVariable("customerId") long customerId) {
		logger.info("findCustomerById API has started");
		try {
			Customer customer=customerService.findCustomerById(customerId);
			logger.info("Customer is found and findCustomerById API ended");
			return ResponseEntity.ok().body(customer);
			
		} catch (Exception e) {

			logger.error("some error occur , no Customer is found");
			return ResponseEntity.internalServerError().body("No Customer is Found");
		
		}
	}

}
