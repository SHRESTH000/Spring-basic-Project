package com.mvc.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.contoller.StudentDataController;
import com.mvc.model.Student;

public class SaveStudentDataMain {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Student.xml");
		StudentDataController studentDataController=(StudentDataController) applicationContext.getBean("studentdatacontroller");
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your StudentId");
		int studentid=scanner.nextInt();
		System.out.println("Enter your Student name ");
		String  name= scanner.next();
		System.out.println("Enter your student age ");
		int age=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your student address ");
		String address= scanner.nextLine();
		System.out.println("Enter your student email");
		String email= scanner.next();
		
		
		scanner.close();
		
		/* System.out.println(studentid+" "+name+" "+age+" "+address+" "+email); */
		/* System.out.println(address +"   "+email); */
		
		
		
		  Student student=new Student(); 
		  student.setStudentId(studentid);
		  student.setStudentName(name);
		  student.setAge(age);
		  student.setAddress(address);
		  student.setEmail(email);
		  
		  studentDataController.SaveStudentData(student);
		 
	}

}
