package com.model;

public class Class {
	private String ClassNum;
	private String Name;
	
	public void setClassNum(String num) {
		ClassNum=num;
	}
	
	public void setName(String name) {
		Name=name;
	}
	
	public String getClassNum() {
		return ClassNum;
	}
	
	public String getName() {
		return Name;
	}
	@Override
	public String toString() {
		return "Class [ClassNum=" + ClassNum + ", Name=" + Name +"]";
	}
}
