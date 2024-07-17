package com.java.servlet;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.controller.MovieController;
import com.mvc.model.Movie;


@WebServlet("/SaveMovie")
public class SaveMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String movieid=request.getParameter("movieid");
		String MovieName=request.getParameter("moviename");
		String year=request.getParameter("year");
		String Duration=request.getParameter("duration");
		String Rating=request.getParameter("rating");
		
		int MovieId=Integer.parseInt(movieid);
		int Year=Integer.parseInt(year);
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Movie.xml");
		MovieController movieController=(MovieController) applicationContext.getBean("moviecontroller");
		
		
		Movie movie = new Movie();
		movie.setMovieId(MovieId);
		movie.setMovieName(MovieName);
		movie.setYear(Year);
		movie.setDuration(Duration);
		movie.setRating(Integer.parseInt(Rating));
		
		movieController.saveMovie(movie);
		
		
	
	
	}	
		


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}