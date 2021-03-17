package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.bean.Movies;
import com.capg.demo.dao.MovieDaoJPA;

@Service
public class MovieServiceJPA implements MovieService {
	
	@Autowired
	MovieDaoJPA mdao;
	@Override
	public List<Movies> printAllMovies() {
		return mdao.findAll();
	}


	@Override
	public List<Movies> createMovies(Movies movie) {
		mdao.saveAndFlush(movie);
		return mdao.findAll();
	}

	@Override
	public List<Movies> updateMovies(Movies movie) {
		mdao.saveAndFlush(movie);
		return mdao.findAll();
	}

	public List<Movies> findMovieByName(String name) {
		return mdao.findByName(name);
	}
	public List<Movies> findMovieByGenre(String genre) {
		return mdao.findByGenre(genre);
	}
	/*public List<Movies> deleteByMovieName(String name) {
		return mdao.deleteByName(name);
	}*/
}
