package com.planittraining;

import java.util.ArrayList;
import java.util.List;

public class BenchManager extends Employee {
    List<Person> consultants = new ArrayList<Person>();

    public BenchManager(String fullName){
        super(fullName);
    }

    public void addConsultant (Person consultant){
        consultants.add(consultant);

    }

    public void listConsultants(){
        for (Person consultant : this.consultants){
            System.out.println(consultant.getFullName());
        }
    }
}
