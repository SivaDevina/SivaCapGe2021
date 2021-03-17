package com.capg.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {
	@Id
	private String name;
	private String genre;
	private double rating;
	
	public Movies() {
		
	}

	public Movies(String name, String genre, double rating) {
		super();
		this.name = name;
		this.genre = genre;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}
