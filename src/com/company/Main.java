package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner takeinput = new Scanner(System.in);

        String name;
        int age;
        String salary;

        System.out.print("What is your name? :");
        name = takeinput.next();
        System.out.print("What is your age? :");
        age = takeinput.nextInt();
        System.out.print("What is your salary? :");
        salary = takeinput.next();

        System.out.println();

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your salary is: " + salary);

    }
}
