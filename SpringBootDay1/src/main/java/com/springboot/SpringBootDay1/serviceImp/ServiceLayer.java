package com.springboot.SpringBootDay1.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SpringBootDay1.DaoLayer.DaoImplementation;

@Service
public class ServiceLayer {
	
	@Autowired
	private DaoImplementation daoImplementation;
	
	public String registration() {
		daoImplementation.register();
		return "sucessfully register";
	}

}
