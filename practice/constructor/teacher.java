package com.practice.constructor;

public class teacher {
private String teacherName;
private int id;
private school schooln;

public teacher() {
	super();
	// TODO Auto-generated constructor stub
}

public teacher(String teacherName, int id, school schooln) {
	super();
	this.teacherName = teacherName;
	this.id = id;
	this.schooln = schooln;
}

@Override
public String toString() {
	return "teacher [teacherName=" + teacherName + ", id=" + id + ", school=" + schooln + "]";
}



}
