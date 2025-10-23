package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	boolean removeById(int eid);

	List<Employee> showAll();

	List<Employee> sortByid();

	List<Employee> searchByName(String nm);

	boolean saveToFile();

}
