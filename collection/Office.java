package com.collection;

import java.util.List;
import java.util.Set;

public class Office {
 private int id;
 private String officeName;
 private List <String> number;
 private Set <String> address;
public Office() {
	super();
	// TODO Auto-generated constructor stub
}
public Office(int id, String officeName, List<String> number, Set<String> address) {
	super();
	this.id = id;
	this.officeName = officeName;
	this.number = number;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getOfficeName() {
	return officeName;
}
public void setOfficeName(String officeName) {
	this.officeName = officeName;
}
public List<String> getNumber() {
	return number;
}
public void setNumber(List<String> number) {
	this.number = number;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "Office [id=" + id + ", officeName=" + officeName + ", number=" + number + ", address=" + address + "]";
}
 
 
 
}
