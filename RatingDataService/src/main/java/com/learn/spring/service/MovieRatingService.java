/**
 * 
 */
package com.learn.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.model.MovieRating;
import com.learn.spring.repo.MovieRatingRepo;

/**
 * @author pavan
 *
 */
@Service
public class MovieRatingService {

	@Autowired
	private MovieRatingRepo movieRatingRepo;
	
	public Optional<MovieRating> getMovieRating(String movieId) {
		return movieRatingRepo.findById(movieId);
	}
	
	public void addOrUpdateMovieRating(MovieRating movieRating) {
		movieRatingRepo.save(movieRating);
	}
	
	public List<MovieRating> getMovieRatingsByUserId(String userId){
		return movieRatingRepo.findByUserId(userId);
	}
}
