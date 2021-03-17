package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.demo.bean.Movies;
import com.capg.demo.dao.MovieDao;

public class MovieServiceImpl implements MovieService{

	@Autowired
	MovieDao mDao;
	@Override
	public List<Movies> printAllMovies() {
		// TODO Auto-generated method stub
		return mDao.getAllMovies();
	}


	@Override
	public List<Movies> createMovies(Movies movie) {
		return mDao.createMovies(movie);
	}


	@Override
	public List<Movies> updateMovies(Movies movie) {
		// TODO Auto-generated method stub
		return mDao.updateMovies(movie);
	}

}
