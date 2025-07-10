package com.company;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee.mangername = "Thilakshana";
        Employee.workinghours = 8;

        emp1.name = "Mendis";
        emp2.name = "sidnem";

        emp1.display();
        System.out.println();
        emp2.display();
        System.out.println();
        Employee.showworkhours();


    }
}
