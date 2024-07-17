package com.mvc.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.controller.MovieController;
import com.mvc.model.Movie;

public class FindByMovieIdMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Movie.xml");
		MovieController movieController =(MovieController) applicationContext.getBean("moviecontroller");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your MovieId");
		int MovieId=scanner.nextInt();
		scanner.close();
		
		Movie movie=movieController.findMovieById(MovieId);
		System.out.println(movie);
	}

}
