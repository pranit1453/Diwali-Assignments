package com.demo.beans;

public class Employee implements Comparable<Employee> {
	private int emp_id;
	private String emp_name;
	private String emp_role;

	public Employee() {
		super();
	}

	public Employee(int emp_id, String emp_name, String emp_role) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_role = emp_role;
	}

	public Employee(int empid) {
		super();
		this.emp_id = empid;
	}

	@Override
	public boolean equals(Object obj) {
		// System.out.println("in equals method " + this.emp_id + "----" + ((Employee)
		// obj).emp_id);
		return this.emp_id == ((Employee) obj).emp_id;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_role() {
		return emp_role;
	}

	public void setEmp_role(String emp_role) {
		this.emp_role = emp_role;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_role=" + emp_role + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// System.out.println("in compareTo method " + this.emp_id + "----" + o.emp_id);

		return (int) (this.emp_id - o.emp_id);
	}

}
