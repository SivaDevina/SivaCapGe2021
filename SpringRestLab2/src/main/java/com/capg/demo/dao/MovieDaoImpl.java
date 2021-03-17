package com.capg.demo.dao;

import java.util.List;

import com.capg.demo.bean.Movies;

public class MovieDaoImpl implements MovieDao {
	private static List<Movies> moviesList;
	@Override
	public List<Movies> getAllMovies() {
		return moviesList;
	}

	@Override
	public List<Movies> createMovies(Movies movie) {
		moviesList.add(movie);
		return moviesList;
	}

	@Override
	public List<Movies> updateMovies(Movies movie) {
		int counter=0;
		for(Movies e:moviesList) {
			if(e.getName()==movie.getName()) {
				moviesList.set(counter, movie);
				return moviesList;
			}
			counter++;
		}
		return null;
	}

}
