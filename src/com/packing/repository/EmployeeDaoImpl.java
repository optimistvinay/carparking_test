package com.packing.repository;

import org.springframework.stereotype.Repository;

import com.packing.model.Employee;


@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao{

	public void saveEmployee(Employee employee) {
		persist(employee);
		
	}

}
