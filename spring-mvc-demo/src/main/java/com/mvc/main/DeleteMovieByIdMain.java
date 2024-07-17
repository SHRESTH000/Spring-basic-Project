package com.mvc.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.controller.MovieController;

public class DeleteMovieByIdMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("movie.xml");
		MovieController movieController=(MovieController) applicationContext.getBean("moviecontroller");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your MovieId to be Deleted");
		int MovieId=scanner.nextInt();
		scanner.close();
		movieController.DeleteMovieById(MovieId);
	}

}
