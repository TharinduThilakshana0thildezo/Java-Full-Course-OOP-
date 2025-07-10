package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1,num2;
        int total;

        System.out.println("Enter first number: ");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter second number: ");
        num2 = Integer.parseInt(br.readLine());
        total = num1 + num2;
        System.out.println("The sum is: " + total);
    }
}
