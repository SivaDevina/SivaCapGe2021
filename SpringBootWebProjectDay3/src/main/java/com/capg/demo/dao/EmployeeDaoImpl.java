package com.capg.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.demo.bean.Employee;

import java.time.LocalDate;
import java.util.ArrayList;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private static List<Employee> empList;
	static {
		empList=new ArrayList<Employee>();
		empList.add(new Employee(1100,"Raja",65000, LocalDate.parse("1993-11-17")));
		empList.add(new Employee(1101,"Sai",35000, LocalDate.parse("1990-07-20")));
		empList.add(new Employee(1102,"Mani",30000,  LocalDate.parse("1992-10-15")));
		empList.add(new Employee(1103,"Satya",45000,  LocalDate.parse("1991-06-18")));
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empList;
	}

	@Override
	public Employee findEmployee(int empid) {
		for(Employee e:empList) {
			if(e.getEmpid()==empid) 
				return e;
		}
		return null; //empList.stream().filter(e->e.getEmpid()==empid).collect(Collectors.toList()).get(0);
	}

	@Override
	public List<Employee> createEmployee(Employee emp) {
		empList.add(emp);
		return empList;
	}

	@Override
	public List<Employee> deleteEmployee(int empid) {
		Employee e=findEmployee(empid);
		if(e!=null) {
			empList.remove(e);
			return empList;
		}
		return null;
	}
	
	@Override
	public List<Employee> updateEmployee(Employee emp) {
		int counter=0;
		for(Employee e:empList) {
			if(e.getEmpid()==emp.getEmpid()) {
				empList.set(counter, emp);
				return empList;
			}
			counter++;
		}
		return null;
	}
}
