package com.learn.spring.repo;

import org.springframework.data.repository.CrudRepository;

import com.learn.spring.model.Movie;

public interface MovieRepo extends CrudRepository<Movie, String> {

}
