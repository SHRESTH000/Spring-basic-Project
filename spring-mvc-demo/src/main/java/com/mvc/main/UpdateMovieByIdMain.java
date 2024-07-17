package com.mvc.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.controller.MovieController;
import com.mvc.model.*;

public class UpdateMovieByIdMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("movie.xml");
		MovieController movieController=(MovieController) applicationContext.getBean("moviecontroller");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your year:");
		int years=scanner.nextInt();
		System.out.println("Enter your duration:");
		String duration=scanner.next();
		System.out.println("Enter your MovieId to be changed:");
		int MovieId=scanner.nextInt();
		
		Movie SetMovie= new Movie();
		SetMovie.setYear(years);
		SetMovie.setDuration(duration);
		SetMovie.setMovieId(MovieId);
		
		movieController.UpdateMovie(SetMovie);
		
	}

}
