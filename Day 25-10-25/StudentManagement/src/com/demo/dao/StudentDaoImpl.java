package com.demo.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.dao.exceptions.AttendanceException;
import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {

	static List<Student> slist;
	static {
		slist = new ArrayList<>();
		slist.add(new Student(1, "Arav", "CS", 85, 92));
		slist.add(new Student(2, "Amar", "IT", 75, 88));
		slist.add(new Student(3, "Neha", "ECE", 55, 62));
		slist.add(new Student(4, "Raj", "EEE", 74, 84));
		slist.add(new Student(5, "Ravi", "CS", 95, 92));
		slist.add(new Student(6, "Ankit", "IT", 65, 42));
		slist.add(new Student(7, "Ravi", "ECE", 78, 64));
		slist.add(new Student(8, "Meera", "EEE", 82, 92));
		slist.add(new Student(9, "Sonal", "CS", 74, 64));
		slist.add(new Student(10, "Rekha", "CS", 58, 70));

		for (Student s : slist) {
			try {
				s.calculateGrade();
			} catch (AttendanceException e) {
				System.out.println("Error : " + e.getMessage());
				s.setSgrade("Not Eligible");
			}
		}
	}

	@Override
	public List<Student> getAllStudents() {
		return slist;
	}

	@Override
	public void saveStudentsToFile(List<Student> slist, String filename) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(slist);
			System.out.println("Students saved to file: " + filename);
		} catch (IOException e) {
			System.out.println("Error saving students: " + e.getMessage());
		}
	}

	@Override
	public List<Student> readStudentsFromFile(String filename) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			List<Student> students = (List<Student>) ois.readObject();
			System.out.println("Students loaded from file: " + filename);
			return students;
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error reading students: " + e.getMessage());
			return new ArrayList<>();
		}

	}
}