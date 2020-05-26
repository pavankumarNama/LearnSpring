/**
 * 
 */
package com.learn.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author pavan
 *
 */
@Entity
public class MovieCatalog {

	@Id
	private String movieName;
	private String description;
	private Integer rating;
	
	protected MovieCatalog() {
	}
	
	public MovieCatalog(String name, String desc, Integer rating) {
		this.movieName = name;
		this.description = desc;
		this.rating = rating;
	}

	public String getName() {
		return movieName;
	}
	
	public void setName(String name) {
		this.movieName = name;
	}
	
	public String getDesc() {
		return description;
	}
	
	public void setDesc(String desc) {
		this.description = desc;
	}
	
	public Integer getRating() {
		return rating;
	}
	
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "CatalogItem [name=" + movieName + ", desc=" + description + ", rating=" + rating + "]";
	}

}
