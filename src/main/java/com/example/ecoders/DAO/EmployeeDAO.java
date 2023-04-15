package com.example.ecoders.DAO;

import java.util.List;

import com.example.ecoders.entity.Employee;

public interface EmployeeDAO {
	//find list of employees
public List<Employee> findAll();
	// find by id 
public Employee findById(int theid);
	// update and put employee
public void save(Employee theEmployee);
	// delete an employee
public void deleteById(int theid);

}
