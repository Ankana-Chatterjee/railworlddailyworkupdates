package com.practice.constructor;

public class school {
private String schoolName;

public school(String schoolName) {
	super();
	this.schoolName = schoolName;
}

@Override
public String toString() {
	return "school [schoolName=" + schoolName + "]";
}

}
