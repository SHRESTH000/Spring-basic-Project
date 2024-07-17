package com.mvc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.controller.MovieController;

public class CountMovieMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("movie.xml");
		MovieController movieController=(MovieController) applicationContext.getBean("moviecontroller");
		
		int count=movieController.CountMovie();
		System.out.println("The total movie is :"+count);
	}

}
