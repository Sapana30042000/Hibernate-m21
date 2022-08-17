package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Employee;

public class EmployeeDaoimpl implements EmployeeDao 
{   
	//we are going to use entitymanager method-CRUD
	private EntityManager em;
	
    //default constructor
	public EmployeeDaoimpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	//to add=>persist(objname);
	public void addEmployee(Employee emp) 
	{
		em.detach(emp);
	}

	@Override
	public void updateEmployee(Employee emp) 
	{
		em.merge(emp);
		
	}

	@Override
	//to retrive a data=>find(classname,pk)
	public Employee getEmployeeById(int ID) 
	{
		Employee emp=em.find(Employee.class, ID);
		return null;
	}

	@Override
	//to remove=>remove(objname);
	public void removeEmployee(Employee emp) 
	{
		em.remove(emp);
		
	}

	@Override
	//transaction method to start and close the Entity Manager
	public void commitTransaction() 
	{
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() 
	{
		em.getTransaction().begin();
		
	}

}
