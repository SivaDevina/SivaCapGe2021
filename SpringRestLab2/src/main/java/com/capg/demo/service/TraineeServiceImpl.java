package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.bean.Trainee;
import com.capg.demo.dao.TraineeDao;

@Service
public class TraineeServiceImpl implements TraineeService{
	
	@Autowired
	TraineeDao tdao;
	@Override
	public List<Trainee> printAllTrainee() {
		return tdao.getAllTrainee();
	}

	@Override
	public Trainee findTrainee(int traineeId) {
		// TODO Auto-generated method stub
		return tdao.findTrainee(traineeId);
	}

	@Override
	public List<Trainee> createTrainee(Trainee trainee) {
		if(trainee.getTraineeId()==0 || trainee.getTraineeName()==null)
			return null;
		else
			return tdao.createTrainee(trainee);
	}

	@Override
	public List<Trainee> removeTrainee(int traineeid) {
		// TODO Auto-generated method stub
		return tdao.deleteTrainee(traineeid);
	}

	@Override
	public List<Trainee> updateTrainee(Trainee trainee) {
		if(trainee.getTraineeId()==0)
			return null;
		else
			return tdao.updateTrainee(trainee);
	}

}
