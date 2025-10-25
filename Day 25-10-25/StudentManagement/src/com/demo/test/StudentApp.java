package com.demo.test;

import java.util.List;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.services.StudentServices;
import com.demo.services.StudentServicesImpl;

public class StudentApp {

	public static void main(String[] args) {
		StudentServices sservices = new StudentServicesImpl();
		StudentDao sdao = new StudentDaoImpl();

		// Get current list from DAO
		List<Student> slist = sdao.getAllStudents();

		// Sort students by attendance descending
		List<Student> sortedList = sservices.sortByAttendanceDesc(slist);

		// Save to file
		sdao.saveStudentsToFile(sortedList, "students.dat");

		// Read back from file
		List<Student> readStudents = sdao.readStudentsFromFile("students.dat");

		System.out.println("Students (Sorted by attendance):");
		sservices.displayStudents(readStudents);
	}

}
