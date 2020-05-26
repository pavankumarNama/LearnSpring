/**
 * 
 */
package com.learn.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.model.Movie;
import com.learn.spring.repo.MovieRepo;

/**
 * @author pavan
 *
 */
@Service
public class MovieService {

	@Autowired
	private MovieRepo movieRepo;
	
	public Optional<Movie> getMovie(String movieId) {
		return movieRepo.findById(movieId);
	}
	
	public void addOrUpdateMovie(Movie movie) {
		movieRepo.save(movie);
	}
}
