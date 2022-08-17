package com.cg.dao;

import com.cg.entities.Employee;

public interface EmployeeDao 
{

	void addEmployee(Employee emp);//creation
	void updateEmployee(Employee emp);//updation
	Employee getEmployeeById(int ID);//Retrieve
	void removeEmployee(Employee emp);//Delete
	
	void commitTransaction();//close an entity manager
	
	void beginTransaction();//begin the operation of entity Manager
}
