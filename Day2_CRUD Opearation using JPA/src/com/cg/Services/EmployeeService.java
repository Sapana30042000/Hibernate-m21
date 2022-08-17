package com.cg.Services;

import com.cg.entities.Employee;

public interface EmployeeService 
{
	void addEmployee(Employee emp);//creation
	void updateEmployee(Employee emp);//updation
	Employee getEmployeeById(int ID);//Retrieve
	void removeEmployee(Employee emp);//Delete
}
