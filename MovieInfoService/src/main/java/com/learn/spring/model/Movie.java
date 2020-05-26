/**
 * 
 */
package com.learn.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author pavan
 *
 */
@Entity
public class Movie {

	@Id
	private String movieId;
	private String movieName;
	private String movieDescription;
	
	protected Movie() {
	}
	
	public Movie(String movieId, String movieName, String movieDescription) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDescription = movieDescription;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + "]";
	}
	
}
