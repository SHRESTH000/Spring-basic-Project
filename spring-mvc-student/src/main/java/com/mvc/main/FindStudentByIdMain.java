package com.mvc.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.contoller.StudentDataController;
import com.mvc.model.Student;

public class FindStudentByIdMain {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Student.xml");
		StudentDataController studentDataController=(StudentDataController) applicationContext.getBean("studentdatacontroller");
         
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your StudentID");

		int studentid=scanner.nextInt();
		
		Student student=new Student();
		
		student=studentDataController.FindStudentById(studentid);
		System.out.println(student);
		
		
	}

}
