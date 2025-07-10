package com.company;

public class Employee {

    String name;
    static int workinghours;
    static String mangername;

    public void display() {
        System.out.println("Employee name is: " + this.name);
        System.out.println("Employee mangername is: " + mangername);

    }
    public static void showworkhours(){
        System.out.println("work hours: " + workinghours);
    }
}
