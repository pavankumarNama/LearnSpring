/**
 * 
 */
package com.learn.spring.model;

/**
 * @author pavan
 *
 */
public class MovieRating {

	private String movieId;
	private String userId;
	private Integer movieRating;
	
	public MovieRating() {
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
