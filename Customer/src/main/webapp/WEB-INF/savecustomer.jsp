<%@page import="com.example.Customer.context.ApplicationContextHolder"%>
<%@page import="com.example.Customer.dao.CustomerDao"%>
<%@page import="com.example.Customer.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	CustomerDao customerDao=ApplicationContextHolder.getContext().getBean(CustomerDao.class);
	String name = request.getParameter("customername");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	String address = request.getParameter("address");
	String password = request.getParameter("password");

	Customer customer = new Customer();
	customer.setCustomerName(name);
	customer.setEmail(email);
	customer.setMobileNo(mobile);
	customer.setAddress(address);
	customer.setPassword(password);

	Customer savedCustomer = customerDao.save(customer);
	%>
	<h3>Saved Customer details are :<%=  savedCustomer%></h3>

</body>
</html>