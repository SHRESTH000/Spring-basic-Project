<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Movie</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
</head>
<body>
<header style="background-color:; height: 40px;width: 100px; "></header>

	<div class="container" style="background-color: grey; width: 100%; height: 80px;" >
		<form action="findmoviebyid" class="Form">
			<div class="form-group">
				<label>Enter your id</label> 
				<input type="text" placeholder="Enter your MovieId" name="movieId">					
			</div>
			<div class="form-group">>
				<button type="submit">Find</button>
				<button type="reset">Clear</button>
			</div>
		</form>
	</div>

</body>
</html>