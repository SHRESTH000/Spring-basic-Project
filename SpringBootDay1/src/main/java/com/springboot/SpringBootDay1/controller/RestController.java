package com.springboot.SpringBootDay1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springboot.SpringBootDay1.serviceImp.ServiceLayer;

@Controller
public class RestController {

	@Autowired
	private ServiceLayer serviceLayer;
	
	public String registed() {
	
		serviceLayer.registration();
		return "sucess";
	}
}
