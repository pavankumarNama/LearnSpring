/**
 * 
 */
package com.learn.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.spring.model.MovieRating;

/**
 * @author pavan
 *
 */
public interface MovieRatingRepo extends JpaRepository<MovieRating, String>{

	public List<MovieRating> findByUserId(String userId);
	
}
