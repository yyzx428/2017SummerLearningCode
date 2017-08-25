package com.firstSpringMvc.model;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -608032051876592959L;
	private String Name;
	private String Address;
	
	public void setName(String name) {
		Name=name;
	}
	
	public void setAddress(String address) {
		Address=address;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getAddress() {
		return Address;
	}
}
