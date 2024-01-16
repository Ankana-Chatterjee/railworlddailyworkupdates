package com.practice.springcore;

public class Teacher {
	private String teacherName;
	private Student studentRef;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Student getStudentRef() {
		return studentRef;
	}

	public void setStudentRef(Student studentRef) {
		this.studentRef = studentRef;
	}

	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", studentRef=" + studentRef + "]";
	}

	
	
	
}