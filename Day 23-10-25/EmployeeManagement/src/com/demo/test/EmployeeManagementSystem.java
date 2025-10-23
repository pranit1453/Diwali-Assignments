package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.services.EmployeeServices;
import com.demo.services.EmployeeServicesImpl;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EmployeeServices eservices = new EmployeeServicesImpl();

		Operations op = null;
		String ans = null;

		do {
			System.out.println("---Select Operation---");

			for (Operations o : Operations.values()) {
				System.out.println(o.ordinal() + "." + o);
			}
			System.out.print("Enter Choice: ");
			String input = sc.nextLine();
			int choice = 0;
			try {
				choice = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			if (choice < 0 || choice >= Operations.values().length) {
				System.out.println("Invalid choice!!!");
				continue;
			}

			op = Operations.values()[choice];
			switch (op) {
			case AddEmployee -> {
				boolean status = eservices.addEmployee();
				if (status) {
					System.out.println("Data Added Successfully");
				} else {
					System.out.println("Something went wrong");
				}
			}
			case RemoveEmployee -> {
				System.out.print("Enetr id for delete: ");
				int eid = sc.nextInt();
				sc.nextLine();
				boolean status = eservices.deleteById(eid);
				if (status) {
					System.out.println("deleted successfully");
				} else {
					System.out.println("not found");
				}
			}
			case ShowAllEmployee -> {
				List<Employee> e = eservices.displayAll();
				e.forEach(System.out::println);
			}
			case SortEmployeeById -> {
				List<Employee> lst = eservices.sortById();
				lst.forEach(System.out::println);
			}
			case FindEmployeeByName -> {
				System.out.print("Enter name for searching: ");
				String nm = sc.next();
				List<Employee> elst = eservices.findByName(nm);
				if (elst != null) {
					elst.forEach(System.out::println);
				} else {
					System.out.println("not found");
				}
			}
			case SaveAllEmployeeToFile -> {
				boolean status = eservices.saveAllToFile();
				if (status)
					System.out.println("All employees saved successfully!");
				else
					System.out.println("Failed to save employees.");
			}
			case Quit->{
				System.out.println("Thank You");
				sc.close();
				return;
			}
			default ->{
				System.out.println("Invalid Operations choose a correct a operation.");
			}
			}
			System.out.print("Do you want to check for another number? (y/n): ");
			ans = sc.next();
			sc.nextLine();

		} while (ans.equalsIgnoreCase("y"));
		
	}

}
