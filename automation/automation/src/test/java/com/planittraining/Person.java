package com.planittraining;

public class Person {
	public String firstName;
	private int age;
    private String fullName;
	
    public Person (String fullName){
        this.fullName = fullName;
    } 

	public String getFullName(){
		return this.fullName;
	}

    protected void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
		
	
	public boolean isAllowedToDrive() {
		if (this.age>16) return true;
		return false;
	}
}
