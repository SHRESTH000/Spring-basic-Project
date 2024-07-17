package com.example.Customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Customer.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {

	
	
}
