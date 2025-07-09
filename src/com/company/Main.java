package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1;
        int number2;
        char operation;
        int result;

        System.out.print("Enter a number: ");
        number1 = sc.nextInt();

        System.out.print("What the second number:");
        number2 = sc.nextInt();

        System.out.print("What is your calculation(+,-,*,/) : ");
        operation = sc.next().charAt(0);

        if(operation == '+'){
            result = number1+number2;
            System.out.println("The Output is: " + result);
        }
        else if(operation == '-'){
            result = number1-number2;
            System.out.println("The Output is: " + result);
        }
        else if(operation == '*'){
            result = number1*number2;
            System.out.println("The Output is: " + result);

        }
        else{
            result = number1/number2;
            System.out.println("The Output is: " + result);

        }
        sc.close();

        System.out.println("Thank you for using our Calculator");





    }
}
