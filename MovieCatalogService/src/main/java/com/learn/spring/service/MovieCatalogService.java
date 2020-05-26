/**
 * 
 */
package com.learn.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.repo.MovieCatalogRepo;

/**
 * @author pavan
 *
 */
@Service
public class MovieCatalogService {

	@Autowired
	private MovieCatalogRepo movieCatalogRepo;
	
	
}
