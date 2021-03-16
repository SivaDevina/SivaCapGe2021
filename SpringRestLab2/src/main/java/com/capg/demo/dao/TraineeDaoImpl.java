package com.capg.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.demo.bean.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao {
	private static List<Trainee> traineeList;
	@Override
	public List<Trainee> getAllTrainee() {
		return traineeList;
	}

	@Override
	public Trainee findTrainee(int traineeid) {
		for(Trainee e:traineeList) {
			if(e.getTraineeId()==traineeid) 
				return e;
		}
		return null;
	}

	@Override
	public List<Trainee> createTrainee(Trainee trainee) {
		traineeList.add(trainee);
		return traineeList;
	}

	@Override
	public List<Trainee> deleteTrainee(int traineeid) {
		Trainee e=findTrainee(traineeid);
		if(e!=null) {
			traineeList.remove(e);
			return traineeList;
		}
		return null;
	}

	@Override
	public List<Trainee> updateTrainee(Trainee trainee) {
		int counter=0;
		for(Trainee e:traineeList) {
			if(e.getTraineeId()==trainee.getTraineeId()) {
				traineeList.set(counter, trainee);
				return traineeList;
			}
			counter++;
		}
		return null;
	}

}
