package com.jdc04.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdc04.Entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {

}
