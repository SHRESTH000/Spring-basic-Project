<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Customer Registration</title>
</head>
<body>
	<header style="height: 40px; background-color: blue; front-size: 25px;">Save
		customer</header>
	<br>
	<div class="container" style="background-color: Lavender">
		<h2>Customer Register</h2>
		<br>
		<form action="SaveCustomerServlet" method="post">
			<div class="form-group" style="width: 60%">
				<label>Name:</label><input type="text" name="customername"
					class="from-control" required>
			</div>
			<div class="form-group" style="width: 60%">
				<label>Email:</label><input type="email" name="email"
					class="from-control" required>
			</div>
			<div class="form-group" style="width: 60%">
				<label>MobileNo:</label><input type="number" name="mobile"
					class="from-control" required>
			</div>
			<div class="form-group" style="width: 60%">
				<label>Address:</label><input type="text" name="address"
					class="from-control" required>
			</div>
			<div class="form-group" style="width: 60%">
				<label>Password:</label><input type="password" name="password"
					class="from-control" required>
			</div>
			<div class="form-group" style="width: 60%">
			   <button type="submit" class="btn btn-sucess">Save Customer</button>
			   <button type="reset" class="btn btn-waring">Clear</button>
			
			</div>
		</form>
	</div>
</body>
</html>