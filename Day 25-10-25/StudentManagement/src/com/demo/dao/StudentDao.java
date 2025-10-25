package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {



	List<Student> readStudentsFromFile(String filename);

	void saveStudentsToFile(List<Student> sortedList, String string);

	List<Student> getAllStudents();

}
