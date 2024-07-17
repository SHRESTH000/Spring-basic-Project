<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Count Movie</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
</head>
<body>
<header style="background-color:; height: 40px;width: 100px; "></header>

	<div class="container" style="background-color:lavender; width: 100%; height: 80px;" >
		<form action="CountMovie" class="Form">
			<div class="form-group">
				<label>Find Total Count</label> 
				<div class="display"><span class="answer"> <strong>${count}</strong>></span></div>					
			</div>
			<div class="form-group">>
				<button type="submit">Count</button>
				<button type="reset">Clear</button>
			</div>
		</form>
	</div>

</body>
</html>