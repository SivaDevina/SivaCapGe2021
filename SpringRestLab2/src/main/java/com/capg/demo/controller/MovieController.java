package com.capg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.bean.Movies;
import com.capg.demo.service.MovieServiceJPA;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	MovieServiceJPA mservice;
	@GetMapping
	public List<Movies> printAllMovies() {
		return mservice.printAllMovies();
	}
	@GetMapping("name/{name}")
	public List<Movies> getByName(@PathVariable String name) {
		return mservice.findMovieByName(name);
	}
	@GetMapping("genre/{genre}")
	public List<Movies> findByGenre(@PathVariable String name) {
		return mservice.findMovieByGenre(name);
	}
	@PostMapping
	public List<Movies> saveMovies(@RequestBody Movies movie) {
			return mservice.createMovies(movie);
	}
	/*@DeleteMapping("/{name}")
	public List<Movies> deleteMovies(@PathVariable String name){
		return mservice.deleteByMovieName(name);
	}*/
	@PutMapping
	public List<Movies> updateMovies(@RequestBody Movies movie){
		return mservice.updateMovies(movie);
	}
	
}
