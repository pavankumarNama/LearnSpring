/**
 * 
 */
package com.learn.spring.repo;

import org.springframework.data.repository.CrudRepository;

import com.learn.spring.model.MovieCatalog;

/**
 * @author pavan
 *
 */
public interface MovieCatalogRepo extends CrudRepository<MovieCatalog, String>{

}
