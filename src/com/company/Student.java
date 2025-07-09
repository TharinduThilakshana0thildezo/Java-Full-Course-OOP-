package com.company;

public class Student {

    String name;//this variable have default  not like local variables
    int nSubjects;

    public void showsdutentdetails(){

        nSubjects = 12;//like this we can use same varible in a method

        System.out.println("Student name is "+name);
        System.out.println("Student nSubjects is "+this.nSubjects);
    }



}
