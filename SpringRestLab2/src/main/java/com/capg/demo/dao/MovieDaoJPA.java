package com.capg.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.demo.bean.Movies;

@Repository
public interface MovieDaoJPA extends JpaRepository<Movies,Integer> {
	public List<Movies> findByName(String name);
	public List<Movies> findByGenre(String genre);
	//public List<Movies> deleteByName(String name);
}
