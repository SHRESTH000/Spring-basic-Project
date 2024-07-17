package com.mvc.model;

import lombok.Data;




// this will add getters and setters for the fields of the class

public class Movie {

	private int movieId;
	private String movieName;
	private int year;
	private String duration;
	private int rating;
	
	
	
	
	public int getMovieId() {
		return movieId;
	}
	//@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", year=" + year + ", duration=" + duration
				+ ", rating=" + rating + "]";
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
