package com.practice.autoWire;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	private String street;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street) {
		super();
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + "]";
	}

}
