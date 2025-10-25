package com.demo.services;

import java.util.List;

import com.demo.beans.Student;

public interface StudentServices {

	List<Student> sortByAttendanceDesc(List<Student> slist);

	void displayStudents(List<Student> readStudents);



	

}
