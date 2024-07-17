package com.mvc.contoller;

import java.security.PublicKey;
import java.util.List;

import org.apache.coyote.http11.filters.VoidInputFilter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mvc.model.Student;

import lombok.*;

@Data
public class StudentDataController {
	
	/*
	 * MovieController - we perform all CRUD operations(like save get update ...)  
	 * Jdbctemplate - this has methods which perform all CRUD operations(to execute all queries)
	 * datasource - represents database connections properties
	 */
	
	private JdbcTemplate jdbcTemplate;
	
	
	/*
	 * public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate =
	 * jdbcTemplate; }
	 */

	public void SaveStudentData(Student student) {
		
		String sqlQuery="insert into studentData(studentID,studentName,age,address,email) values(?,?,?,?,?)";
		Object[] inputdata= {student.getStudentId(),student.getStudentName(),student.getAge(),student.getAddress(),student.getEmail()};
		
		//execute query 
		jdbcTemplate.update(sqlQuery,inputdata);
		System.out.println("your student data sucessfully save");
	}
	
	public void UpdateStudentDataById(Student student) {
		
		String sqlquery="update studentData SET address=?, age=? where studentID=?;";
		Object[] updateData= {student.getAddress(),student.getAge(),student.getStudentId()};
		
		jdbcTemplate.update(sqlquery,updateData);
		System.out.println("Your student data is updated");
		
	}
	
	public List<Student> FindAllStudentData(){
		
		String sqlquery="Select studentID,studentName,age,address,email from studentData";
		
		List<Student> AllStudentData=jdbcTemplate.query(sqlquery,new BeanPropertyRowMapper<Student>(Student.class));
	    
		if(AllStudentData!=null) {
			return AllStudentData;
		}
		return null;
	
	}
	
	public Student FindStudentById( Integer studentId) {
		
		String sqlquery="Select studentID,studentName,age,address,email from studentData where studentID= ?";
		
		Object[] inputdata= {studentId};
		
		Student studentDatafromDatabase=jdbcTemplate.queryForObject(sqlquery, inputdata,new BeanPropertyRowMapper<Student>(Student.class));
		
		if(studentDatafromDatabase !=null) {
			return studentDatafromDatabase;
		}
		
		return null;
		
		
		
	}
	
	public int CountStudentData() {
		
		String sqlquery="select count(*) from studentData";
		
		int count=jdbcTemplate.queryForObject(sqlquery, Integer.class);
		
		return count;
	}
	
	public void DeleteStudentDataById(int studenId) {
		
		String Sqlquery="delete from studentData where studentId=?;";
		
		Object[] inputdata= {studenId};
		
		jdbcTemplate.update(Sqlquery,inputdata);
		
		System.out.println("Your Student Data is Deleted Sucessfully");
		
	}
	

}
