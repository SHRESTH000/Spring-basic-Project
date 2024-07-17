package com.mvc.controller;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mvc.model.Movie;

import lombok.Data;

@Data
public class MovieController {
	
	/*
	 * MovieController - we perform all CRUD operations(like save get update ...)  
	 * Jdbctemplate - this has methods which perform all CRUD operations(to execute all queries)
	 * datasource - represents database connections properties
	 */
	
	private JdbcTemplate jdbcTemplate;
	
	
	  public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	  { 
		  this.jdbcTemplate =jdbcTemplate; 
		  }
	 
	
	public void saveMovie(Movie movie) {
		
		String sqlQuery="insert into movie(movieId,movieName,years,duration,rating) values (?,?,?,?,?)";
		// pass the value from movie to object array
		Object[] inputData= { movie.getMovieId(),movie.getMovieName(),movie.getYear(),movie.getDuration(),movie.getRating()};
		// execute query
		
		jdbcTemplate.update(sqlQuery,inputData);
		System.out.println("your movie save sucessfully");
	}
	
	public Movie findMovieById(int inputMovieID ) {
		
		String sqlQuery="select movieId,movieName,years,duration,rating from movie where movieId=?";
		Object[] inputId= {inputMovieID};
		
		Movie movieFromDatabase=jdbcTemplate.queryForObject(sqlQuery, inputId,new BeanPropertyRowMapper<Movie>(Movie.class));
		
		if(movieFromDatabase!=null) {
			return movieFromDatabase;
		}
		return null;
	}

	public List<Movie> FindAllMovie(){
		
		String sqlQuery="select movieId,movieName,years,duration,rating from movie ";
		
		List<Movie> movieFromDatabaseList=jdbcTemplate.query(sqlQuery, new BeanPropertyRowMapper<Movie>(Movie.class));
		
		if(movieFromDatabaseList!=null) {
			return movieFromDatabaseList;
					
		}
		return  null;
	}
	
	public void UpdateMovie(Movie movie) {
		
		String sqlQuery=" update movie set years=?,duration=? where movieId=?";
		
		Object[] Inputdata= {movie.getYear(),movie.getDuration(),movie.getMovieId()};
		jdbcTemplate.update(sqlQuery,Inputdata);
		System.out.println("you have sucessfully updated your valur ");
	}
	
	
	  public int CountMovie() 
	  { 
		  String sqlQuery="select count(*) from movie";
	  
	  int count=jdbcTemplate.queryForObject(sqlQuery, Integer.class);
	  
	  return count;
	  }
	 
	public void DeleteMovieById(int InputId) {
		String sqlQueryString="Delete From movie where movieId=?";
		
		Object[] inputId= {InputId};
		
		jdbcTemplate.update(sqlQueryString,inputId);
		
		System.out.println("you have sucessfully delete movie from database");
	}
}
