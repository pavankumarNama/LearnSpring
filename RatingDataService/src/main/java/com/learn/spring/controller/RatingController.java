/**
 * 
 */
package com.learn.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.spring.model.MovieRating;
import com.learn.spring.service.MovieRatingService;

/**
 * @author pavan
 *
 */
@RestController
@RequestMapping("/ratingsdata")
public class RatingController {

	@Autowired
	private MovieRatingService movieRatingService;
	
	@GetMapping("/{movieId}")
	private Optional<MovieRating> getRating(@PathVariable("movieId") String movieId) {
		return movieRatingService.getMovieRating(movieId);
	}
	
	@GetMapping("/user/{userId}")
	private List<MovieRating> getMoviesRatingsByUserId(@PathVariable("userId") String userId) {
		return movieRatingService.getMovieRatingsByUserId(userId);
	}
	
	@PostMapping("/add/movieRating")
	private void addMovieRating(MovieRating movieRating) {
		movieRatingService.addOrUpdateMovieRating(movieRating);
	}
}
