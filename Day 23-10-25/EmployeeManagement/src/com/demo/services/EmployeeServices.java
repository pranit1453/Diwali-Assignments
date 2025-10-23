package com.demo.services;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeServices {

	boolean addEmployee();

	boolean deleteById(int eid);

	List<Employee> displayAll();

	List<Employee> sortById();

	List<Employee> findByName(String nm);

	boolean saveAllToFile();

}
