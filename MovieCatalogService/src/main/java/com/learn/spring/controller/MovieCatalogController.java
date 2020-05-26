/**
 * 
 */
package com.learn.spring.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.learn.spring.model.Movie;
import com.learn.spring.model.MovieCatalog;
import com.learn.spring.model.MovieRating;

/**
 * @author pavan
 *
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webclientBuilder;
	
	@GetMapping("/{userId}")
	private List<MovieCatalog> getCatalogs(@PathVariable ("userId") String userId){
		//MovieRating[] movieRatings  = restTemplate.getForObject("http://rating-data-service/ratingsdata/user/" + userId,  MovieRating[].class);
		
		MovieRating[] movieRatings = webclientBuilder.build()
													.get()
													.uri("http://rating-data-service/ratingsdata/user/" + userId)
													.retrieve()
													.bodyToMono(MovieRating[].class)
													.block();
		
		return Arrays.asList(movieRatings).stream().map(movieRating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + movieRating.getMovieId(),
					Movie.class);
			return new MovieCatalog(movie.getMovieName(), movie.getMovieDescription(), movieRating.getMovieRating());
		}).collect(Collectors.toList());
 
	}
	
}
