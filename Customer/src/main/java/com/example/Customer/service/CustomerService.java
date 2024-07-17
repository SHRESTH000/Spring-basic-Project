package com.example.Customer.service;

import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Customer.dao.CustomerDao;
import com.example.Customer.model.Customer;
import com.example.Customer.request.CustomerRequest;

//import ch.qos.logback.classic.Logger;

@Service
public class CustomerService {

	Logger logger= LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	private CustomerDao customerDao;
	
	public Customer saveCustomer(CustomerRequest inputcustomerRequest) {
		
		logger.info("saveCustomer method start");
		Customer customer=new Customer();
		
		customer.setCustomerName(inputcustomerRequest.getCustomerName());
		customer.setEmail(inputcustomerRequest.getEmail());
		customer.setMobileNo(inputcustomerRequest.getMobileNo());
		customer.setAddress(inputcustomerRequest.getAddress());
		customer.setPassword(inputcustomerRequest.getPassword());
		
		Customer savedCustomer=customerDao.save(customer);
		if(savedCustomer == null) {
			logger.error("some error is occur and Customer data is not saved");
			throw new RuntimeException("Customer is not saved");
 		}
		logger.info("saveCustomer method is ended");
		return savedCustomer;
		
	}
	
	public List<Customer> getAllCustomer() {
		
		logger.info("getAllCustomer method  is started");
		List<Customer> customerList=customerDao.findAll();
		
		if(customerList.isEmpty()) {
			logger.error("some error occur , no customer is found");
			throw new RuntimeException("No Customer is found");
			
		}
		logger.info("getAllCustomer method is ended");
		return customerList;
	}
	
	public long countAllCustomer() {
		
		logger.info("countCustomerById method is started ");
		long count=customerDao.count();
		if(count==0) {
			logger.error("Some error Occur no customer found");
			throw new RuntimeException("no Customer is foung");
		}
		logger.info("countCustomerById method ended");
		return count;
	}
	
	public Customer findCustomerById(long customerID) {

		logger.info("findCustomerById method is Started");
		Optional<Customer> customerOptional=customerDao.findById(customerID);
		Customer customerFromDataBase=customerOptional.get();
		if(customerFromDataBase ==null) {
			logger.error("Some error occur , no customer is found");
			throw new RuntimeException("customer doesn't exist");
		}
		logger.info("findCustomerById method is ended");
		return customerFromDataBase;
	}
	
}
