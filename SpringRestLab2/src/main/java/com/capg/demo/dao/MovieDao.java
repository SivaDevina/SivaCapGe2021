package com.capg.demo.dao;

import java.util.List;

import com.capg.demo.bean.Movies;

public interface MovieDao {
	public List<Movies> getAllMovies();
	public List<Movies> createMovies(Movies movie);
	public List<Movies> updateMovies(Movies movie);
}
