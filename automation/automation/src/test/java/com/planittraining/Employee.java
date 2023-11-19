package com.planittraining;

public class Employee extends Person{
	public Employee(String fullName) {
		super(fullName);
	}

	private int idNum;
	
	public void setIdNumber(int id) {
		this.idNum = id;
	}
	
	public int getIdNumber() {
		return this.idNum;
	}
	
}
