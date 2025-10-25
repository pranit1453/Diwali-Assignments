package com.demo.beans;

import java.io.Serializable;

import com.dao.exceptions.AttendanceException;

public class Student implements Serializable {
	private int srollno;
	private String sname;
	private String scourse;
	private double attendancePercentage;
	private double score;
	private String sgrade;

	public Student() {
		super();
	}

	public Student(int srollno, String sname, String scourse, double attendancePercentage, double score) {
		super();
		this.srollno = srollno;
		this.sname = sname;
		this.scourse = scourse;
		this.attendancePercentage = attendancePercentage;
		this.score = score;
	}

	public int getSrollno() {
		return srollno;
	}

	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScourse() {
		return scourse;
	}

	public void setScourse(String scourse) {
		this.scourse = scourse;
	}

	public double getAttendancePercentage() {
		return attendancePercentage;
	}

	public void setAttendancePercentage(double attendancePercentage) {
		this.attendancePercentage = attendancePercentage;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getSgrade() {
		return sgrade;
	}

	public void setSgrade(String sgrade) {
		this.sgrade = sgrade;
	}

	// calculate grade
	public void calculateGrade() throws AttendanceException {
		if (attendancePercentage < 60) {
			throw new AttendanceException("Attendance below 60% for students: " + sname);
		}
		if (score >= 90) {
			sgrade = "A+";
		} else if (score >= 80) {
			sgrade = "A";
		} else if (score >= 70) {
			sgrade = "B";
		} else if (score >= 60) {
			sgrade = "C";
		} else {
			sgrade = "D";
		}
	}

	@Override
	public String toString() {
		return "Student [srollno=" + srollno + ", sname=" + sname + ", scourse=" + scourse + ", attendancePercentage="
				+ attendancePercentage + ", score=" + score + ", sgrade=" + sgrade + "]";
	}

}
