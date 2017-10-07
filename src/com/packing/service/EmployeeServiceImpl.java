package com.packing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packing.model.Employee;
import com.packing.repository.EmployeeDao;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
    private EmployeeDao dao;
	
	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}

}
