package com.example.Customer.controller1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Customer.dao.CustomerDao;
import com.example.Customer.model.Customer;

import ch.qos.logback.classic.Logger;

@WebServlet("/SavecustomerServlet")
public class SaveCustomerServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5511065223226144678L;
	
	@Autowired
	private CustomerDao customerDao;
	
	
	public SaveCustomerServlet() {
		System.out.println("in const");
		System.out.println(this.customerDao);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
			
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String name=request.getParameter("customername");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		String password=request.getParameter("password");
		
		Customer customer=new Customer();
		customer.setCustomerName(name);
		customer.setEmail(email);
		customer.setMobileNo(mobile);
		customer.setAddress(address);
		customer.setPassword(password);
		
		Customer savedCustomer=customerDao.save(customer);
		System.out.println(savedCustomer);
		if(savedCustomer==null) {
			request.setAttribute("msgFromRegister", "you have not sucessfully register please try Again");
			request.getRequestDispatcher("SaveCustomer.jsp").forward(request, response);
			//System.out.println(NoOfRowsInsert);
			//throw new RuntimeException("Error occue");
			
		}
			 
			 System.out.println("new user is register");
			 request.setAttribute("msgFromRegister", "You have sucessfully register");
			 request.getRequestDispatcher("SaveCustomer.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
