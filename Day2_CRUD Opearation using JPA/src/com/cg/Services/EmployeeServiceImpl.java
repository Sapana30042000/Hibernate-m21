package com.cg.Services;

import com.cg.dao.EmployeeDao;
import com.cg.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService
{
     private EmployeeDao dao;
     
	public EmployeeServiceImpl() 
	{
		super();
		dao=new EmployeeDaoimpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployeeById(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

}
