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
public class MovieRating {

	@Id
	private String movieId;
	private String userId;
	private Integer movieRating;
	
	protected MovieRating() {
	}
	
	public MovieRating(String movieId, String userId, Integer movieRating) {
		this.movieId = movieId;
		this.userId = userId;
		this.movieRating = movieRating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public Integer getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(Integer movieRating) {
		this.movieRating = movieRating;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "MovieRating [movieId=" + movieId + ", movieRating=" + movieRating + "]";
	}
	
	
}
