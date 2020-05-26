/**
 * 
 */
package com.learn.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.spring.model.Movie;
import com.learn.spring.service.MovieService;

/**
 * @author pavan
 *
 */
@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping("/{movieId}")
	private Optional<Movie> getMovie(@PathVariable("movieId") String movieId) {
		return movieService.getMovie(movieId);
	}
	
	@PostMapping("/add/movie")
	private void addMovie(Movie movie) {
		movieService.addOrUpdateMovie(movie);
	}
}
