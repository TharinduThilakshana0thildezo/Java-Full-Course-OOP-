package com.company;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        Student student1 = new Student("THilakshan",34021,5,"thilakshantexl@gmail.com");

        student1.showStudentDetails();
        System.out.println();
        student.showStudentDetails();



    }
}
