package com.capg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.bean.Trainee;
import com.capg.demo.service.TraineeJPARepository;

@RestController
@RequestMapping("/traineee")
public class TraineeController {
	@Autowired
	TraineeJPARepository eservice;
	@GetMapping
	public List<Trainee> printAllTrainee() {
		return eservice.printAllTrainee();
	}

	@GetMapping("/{empid}")
	public ResponseEntity<Trainee> findEmployee(@PathVariable int empid) {
		Trainee e=eservice.findTrainee(empid);
		if(e!=null)
			return new ResponseEntity<Trainee>(e,HttpStatus.OK); 
		else
			return new ResponseEntity<Trainee>(HttpStatus.NOT_FOUND);
	}
	//@PostMapping(value="/create", consumes=MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	public List<Trainee> saveTrainee(@RequestBody Trainee emp) {
			return eservice.createTrainee(emp);
	}
	@DeleteMapping("/{empid}")
	public List<Trainee> deleteTrainee(@PathVariable int empid){
		return eservice.removeTrainee(empid);
	}
	@PutMapping
	public List<Trainee> updateTrainee(@RequestBody Trainee emp){
		return eservice.updateTrainee(emp);
	}
	@GetMapping("name/{name}")
	public List<Trainee> findByName(@PathVariable String name) {
		return eservice.findByName(name);
	}
}
