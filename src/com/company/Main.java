package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;

        System.out.println("Enter your age: ");
        age = sc.nextInt();

        if(age > 18){
            System.out.println("You are an adult");
        } else if (age<16) {
            System.out.println("You are an child");

        }
        else{
            System.out.println("You are young");
        }

    }
}
