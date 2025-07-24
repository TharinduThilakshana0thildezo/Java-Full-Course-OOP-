package com.company;

public class main {
    public static void main(String[] args) {

        Employee.nmangername = "Mr Thilakshana";

        Employee emp = new Employee();

        emp.name = "Mendis";
        //emp.nmangername = "Mr Thilakshana";

        Employee emp1 = new Employee();

        emp1.name = "lal";
        //emp1.nmangername = "Mr Thilakshana";

        emp.dispplay();
        System.out.println();
        emp1.dispplay();

    }
}
