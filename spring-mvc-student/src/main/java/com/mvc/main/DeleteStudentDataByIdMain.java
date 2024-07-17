package com.mvc.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.contoller.StudentDataController;

public class DeleteStudentDataByIdMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Student.xml");
		StudentDataController studentDataController=(StudentDataController) applicationContext.getBean("studentdatacontroller");
	    
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your Student id: ");
		int studentid=scanner.nextInt();
		
		studentDataController.DeleteStudentDataById(studentid);
	
	
	}

}
