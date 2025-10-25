package com.demo.services;

import java.util.Collections;
import java.util.List;

import com.demo.beans.Student;

public class StudentServicesImpl implements StudentServices {

	@Override
	public List<Student> sortByAttendanceDesc(List<Student> slist) {
		if (slist == null || slist.isEmpty()) {
			System.out.println("No students to sort.");
			return slist;
		}

		// Sort the list in descending order of attendance
		Collections.sort(slist, (s1, s2) -> Double.compare(s2.getAttendancePercentage(), s1.getAttendancePercentage()));

		return slist;
	}

	@Override
	public void displayStudents(List<Student> readStudents) {
		if (readStudents == null || readStudents.isEmpty()) {
			System.out.println("No student data available.");
			return;
		}

		System.out.println("\n--- Student Details ---");
		for (Student s : readStudents) {
			System.out.println(s);
		}

	}

}
