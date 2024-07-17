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


@WebServlet("/CountMovie")
public class CountMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		String MovieID=request.getParameter("movieId");
		//System.out.println(MovieID);
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Movie.xml");
		MovieController movieController=(MovieController) applicationContext.getBean("moviecontroller");
		 
		int count =movieController.CountMovie();
		
		request.setAttribute("count",count);
		request.getRequestDispatcher("CountMovie.jsp").forward(request, response);
		
		
		
		
		
		/*
		 * response.setContentType("text/html"); PrintWriter pWriter
		 * =response.getWriter(); pWriter.println("<h3>"+movie+"</h3>");
		 */
	
	
	}	
		


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
