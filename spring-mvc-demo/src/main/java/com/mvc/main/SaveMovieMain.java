package com.mvc.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.controller.MovieController;
import com.mvc.model.Movie;

public class SaveMovieMain {

	public static void main(String[] args) {
		
		//@SuppressWarnings("resource")
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("movie.xml");
		MovieController movieController=(MovieController) applicationContext.getBean("moviecontroller");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Movie id name");
		int movieId=scanner.nextInt();
		System.out.println("Enter your MovieName :");
		String movieName=scanner.next();
		System.out.println("Enter your movie year :");
		int year=scanner.nextInt();
		System.out.println("Enter your movie Duration");
		String duration=scanner.next();
		System.out.println("Enter your rating");
		int rating=scanner.nextInt();
		
		Movie inputMovie=new Movie();
		inputMovie.setMovieId(movieId);
		inputMovie.setMovieName(movieName);
		inputMovie.setYear(year);
		inputMovie.setDuration(duration);
		inputMovie.setRating(rating);
		
		movieController.saveMovie(inputMovie);

	}

}
