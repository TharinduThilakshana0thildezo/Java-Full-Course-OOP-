package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        BigInteger num1,num2,num3;
        BigInteger total;
        BigInteger average;

        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your 1st number: ");
        num1 = sc.nextBigInteger();
        System.out.print("Enter your 2nd number: ");
        num2 = sc.nextBigInteger();
        System.out.print("Enter your 3rd number: ");
        num3 = sc.nextBigInteger();

        total = num1.add(num2).add(num3) ;
        average = total.divide(BigInteger.valueOf(3));

        System.out.println(name + " Your Total is: " + total + " and Your Average is " +average);
    }
}
