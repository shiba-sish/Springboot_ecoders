package com.example.ecoders.service;

import java.util.List;

import com.example.ecoders.entity.Employee;

public interface EmployeeService {
public List<Employee> findAll();
public Employee findById(int theid);
public void save(Employee theEmployee);
public void deleteById(int theid);
}
