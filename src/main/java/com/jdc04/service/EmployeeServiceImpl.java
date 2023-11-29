package com.jdc04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc04.Entity.Employee;
import com.jdc04.Repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements Employeeservice {
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public void registerEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

}
