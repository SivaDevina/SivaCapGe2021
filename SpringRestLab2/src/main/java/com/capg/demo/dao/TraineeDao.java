package com.capg.demo.dao;

import java.util.List;

import com.capg.demo.bean.Trainee;

public interface TraineeDao {
	public List<Trainee> getAllTrainee();
	public Trainee findTrainee(int traineeid);
	public List<Trainee> createTrainee(Trainee trainee);
	public List<Trainee> deleteTrainee(int traineeid);
	public List<Trainee> updateTrainee(Trainee rainee);
}
