package com.mvc.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.contoller.StudentDataController;
import com.mvc.model.Student;

public class UpdateStudentDataByIdMain {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Student.xml");
		StudentDataController studentDataController=(StudentDataController) applicationContext.getBean("studentdatacontroller");
	       
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your Student id");
	    int studentid=scanner.nextInt();
	    System.out.println("Enter your Age ");
	    int age=scanner.nextInt();
	    scanner.nextLine();
	    System.out.println("Enter your address ");
	    String address=scanner.nextLine();
	    
	    Student student=new Student();
	    student.setStudentId(studentid);
	    student.setAge(age);
	    student.setAddress(address);
	    
	    studentDataController.UpdateStudentDataById(student);
	    
	
	}

}
