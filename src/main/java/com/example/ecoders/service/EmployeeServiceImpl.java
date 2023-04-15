package com.example.ecoders.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecoders.DAO.EmployeeDAO;
import com.example.ecoders.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
private EmployeeDAO employeeDAO;
	
	@Autowired
	EmployeeServiceImpl(EmployeeDAO employeeDAO) {
	this.employeeDAO=employeeDAO;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll(){
		return employeeDAO.findAll();
	}
	@Override
	@Transactional
	public Employee findById(int theid) {
		return employeeDAO.findById(theid);
	}
	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);		
	}
	
	@Override
	@Transactional
	public void deleteById(int theid) {
	   employeeDAO.deleteById(theid);
	}
}
