package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.bean.Trainee;
import com.capg.demo.dao.TraineeDaoJPA;

@Service
public class TraineeJPARepository implements TraineeService {
	
	@Autowired
	TraineeDaoJPA tDao;
	@Override
	public List<Trainee> printAllTrainee() {
		
		return tDao.findAll();
	}

	@Override
	public Trainee findTrainee(int traineeId) {
		if(tDao.findById(traineeId).isPresent()) {
			return tDao.findById(traineeId).get();
		}
		else {
			return null;
		}
	}

	@Override
	public List<Trainee> createTrainee(Trainee trainee) {
		tDao.saveAndFlush(trainee);
		return tDao.findAll();
	}

	@Override
	public List<Trainee> removeTrainee(int traineeid) {
		tDao.deleteById(traineeid);
		return tDao.findAll();
	}

	@Override
	public List<Trainee> updateTrainee(Trainee trainee) {
		tDao.saveAndFlush(trainee);
		return tDao.findAll();
	}

	public List<Trainee> findByName(String name) {
		return tDao.findByTraineeName(name);
	}
}
