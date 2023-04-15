package com.example.ecoders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecoders.entity.Employee;
import com.example.ecoders.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
private EmployeeService employeeService;
@Autowired
public EmployeeRestController(EmployeeService employeeService) {
	this.employeeService=employeeService;
}
@GetMapping("/allemployee")
public List<Employee> findAll(){
	return employeeService.findAll();
}

@GetMapping("/employee/{theid}")
public Employee findbyid(@PathVariable int theid){
	Employee employee = employeeService.findById(theid);
	if(employee==null) {
		throw new RuntimeException("Employee id is not found!"+theid);
	}
	return  employee;
}

@PostMapping("/employee")
public Employee save(@RequestBody Employee employee){
	employee.setId(0);
	employeeService.save(employee);
	return employee;
}
@PutMapping("/employee")
public Employee updateById(@RequestBody Employee employee) {
	employeeService.save(employee);
	return employee;
	
}

@DeleteMapping("/employee/{theid}")
public String deletebyid(@PathVariable int theid){
	Employee fatchemployee = employeeService.findById(theid);
	if(fatchemployee==null) {
		throw new RuntimeException("Employee id not found:"+theid);
	}
	 employeeService.deleteById(theid);
	 return "deleted employee by id:";
}

}
