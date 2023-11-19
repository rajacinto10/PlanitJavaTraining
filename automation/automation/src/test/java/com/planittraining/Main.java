package com.planittraining;


public class Main {
    public static void main( String[] args ){
        BenchManager manager = new BenchManager("John");
        Consultant c1 = new Consultant("Rose");
        Consultant c2 = new Consultant("MAtt");

        manager.addConsultant(c1);
        manager.addConsultant(c2);
        manager.listConsultants();
    }
        
}
