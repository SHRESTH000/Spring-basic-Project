package com.mvc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.contoller.StudentDataController;

public class CountStudentDataMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Student.xml");
		StudentDataController studentDataController=(StudentDataController) applicationContext.getBean("studentdatacontroller");
		
		int count =studentDataController.CountStudentData();
		System.out.println(" Total Student Data is : "+count);
	}

}
