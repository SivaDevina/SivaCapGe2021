package com.capg.demo.service;

import java.util.List;

import com.capg.demo.bean.Trainee;

public interface TraineeService {
	public List<Trainee> printAllTrainee();
	public Trainee findTrainee(int traineeId) ;
	public List<Trainee> createTrainee(Trainee trainee);
	public List<Trainee> removeTrainee(int traineeid);
	public List<Trainee> updateTrainee(Trainee trainee) ;
}
