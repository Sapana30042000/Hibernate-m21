package com.cg.client;

import com.cg.Services.EmployeeService;
import com.cg.Services.EmployeeServiceImpl;
import com.cg.entities.Employee;

public class Client {

	public static void main(String[] args) {
		//Lazy initialization
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp=new Employee();
		
		//create operation
		emp.setID(105);
		emp.setNAME("Sid R");
		service.addEmployee(emp);
		
		//reteive a data
		emp=service.getEmployeeById(102);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp NAME: "+emp.getNAME());
		
		//update a data
		emp=service.getEmployeeById(102);
		emp.setNAME("Siddhant Rajigare");
		service.updateEmployee(emp);
		
		//retreive a data
		emp=service.getEmployeeById(101);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp NAME: "+emp.getNAME());
		
		//delete a data
		emp=service.getEmployeeById(104);
		service.removeEmployee(emp);

	}

}