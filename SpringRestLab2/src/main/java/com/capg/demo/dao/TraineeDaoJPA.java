package com.capg.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.bean.Trainee;

public interface TraineeDaoJPA extends JpaRepository<Trainee,Integer>{
	public List<Trainee> findByTraineeName(String name);
}
