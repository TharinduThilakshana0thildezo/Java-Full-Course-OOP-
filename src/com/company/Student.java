package com.company;

public class Student {

    String sname;
    int sID;
    int nsubjects;
    String semail;

    public Student() {//deafault constructor
        this.sname = "Sname";
        this.sID = 000;
        this.nsubjects = 0;
        this.semail = "Semail@gmail.com";


    }

    //ovrload constructor
    public Student(String sname, int sID, int nsubjects, String semail) {
        this.sname = sname;
        this.sID = sID;
        this.nsubjects = nsubjects;
        this.semail = semail;

    }

    public void showStudentDetails() {
        System.out.println("Student name: " +this.sname);
        System.out.println("Student ID: " +this.sID);
        System.out.println("Student nsubjects: " +this.nsubjects);
        System.out.println("Student email: " +this.semail);

    }

}
