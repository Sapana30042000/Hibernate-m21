package com.cg.Services;

import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoimpl;
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
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee getEmployeeById(int ID) {
		Employee emp=dao.getEmployeeById(ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		dao.beginTransaction();
		dao.removeEmployee(emp);
		dao.commitTransaction();
	}

}
