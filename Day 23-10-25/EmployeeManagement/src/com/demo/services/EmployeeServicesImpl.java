package com.demo.services;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServicesImpl implements EmployeeServices {
	private EmployeeDao edao;

	public EmployeeServicesImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public boolean addEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter id");
		int empid = sc.nextInt();
		System.out.print("Enter name");
		String nm = sc.next();
		System.out.print("Enter emp role: ");
		String role = sc.next();
		;
		Employee e = new Employee(empid, nm, role);
		return edao.save(e);
	}

	@Override
	public boolean deleteById(int eid) {
		
		return edao.removeById(eid);
	}

	@Override
	public List<Employee> displayAll() {
		
		return edao.showAll();
	}

	@Override
	public List<Employee> sortById() {
	
		return edao.sortByid();
	}

	@Override
	public List<Employee> findByName(String nm) {
		
		return edao.searchByName(nm);
	}

	@Override
	public boolean saveAllToFile() {
		
		return edao.saveToFile();
	}

}
