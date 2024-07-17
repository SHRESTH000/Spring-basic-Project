package com.example.Customer.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SaveAndLoginCustomerController {
//	@GetMapping( "/")
//	public String displayRegPage() {
//		System.out.println("in controller===============");
//		return "SaveCustomer";
//	}

	
	
	
	@RequestMapping(value= "/SaveCustomerServlet",method = RequestMethod.POST)
	public String saveCustomer() {
		System.out.println("in controller===============");
		return "Save ";
	}

}
