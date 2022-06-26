package com.vitalikasaty.spring.springboot.springboot_rest.service;

import java.util.List;

import com.vitalikasaty.spring.springboot.springboot_rest.entity.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public void saveEmployee(Employee employee);
	public Employee getEmployee(int id);
	public void deleteEmployee(int id);
}
