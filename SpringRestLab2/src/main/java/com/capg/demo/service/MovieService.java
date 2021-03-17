package com.capg.demo.service;

import java.util.List;

import com.capg.demo.bean.Movies;

public interface MovieService {
	public List<Movies> printAllMovies();
	public List<Movies> createMovies(Movies movie);
	public List<Movies> updateMovies(Movies movie);
}
