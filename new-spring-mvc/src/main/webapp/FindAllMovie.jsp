<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@page import="com.mvc.model.*"%>
<%@page import="com.mvc.controller.MovieController"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
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

	<div class="container"
		style="background-color: lavender; width: 100%; height: auto;">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>MOVIE_ID</th>
					<th>MOVIE NAME</th>
					<th>YEAR</th>
					<th>DURATION</th>
					<th>RATING</th>
				</tr>
			</thead>
			<tbody>
				<%
				ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Movie.xml");
				MovieController movieController = (MovieController) applicationContext.getBean("moviecontroller");

				List<Movie> movielList = movieController.FindAllMovie();
				//System.out.println(movielList);
				PrintWriter pw=response.getWriter();

				for (Movie movie : movielList) {
					
				%>
				<tr>
					<td>
						<% out.println(movie.getMovieId());						
						%>
						
					</td>
					<td>
						<%
						out.println(movie.getMovieName());
						%>
					</td>
					<td>
						<%
						out.println(movie.getYear());
						%>
					</td>
					<td>
						<%
						out.println(movie.getDuration());
						%>
					</td>
					<td>
						<% out.println(movie.getRating());%>
					</td>
				</tr>
				<%}%>
			</tbody>
		</table>
	</div>

</body>
</html>