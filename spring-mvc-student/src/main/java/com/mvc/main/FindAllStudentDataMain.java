package com.mvc.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.contoller.StudentDataController;
import com.mvc.model.Student;

public class FindAllStudentDataMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Student.xml");
		StudentDataController studentDataController=(StudentDataController) applicationContext.getBean("studentdatacontroller");
		
		System.out.println("ALl student data are:");
		
		List<Student> student=studentDataController.FindAllStudentData();
		
		System.out.println(student);
	}

}
