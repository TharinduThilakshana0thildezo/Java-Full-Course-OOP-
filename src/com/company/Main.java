package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        Double price;
        int quantity;
        int total;

        System.out.println();
        System.out.println("This is ThiL_DeZO's Shopping palace!!");
        System.out.println();

        System.out.print("Hi what would you like to buy: ");
        name = sc.nextLine();

        System.out.print("How Much is the price for each: ");
        price = sc.nextDouble();

        System.out.print("How much items Did you bought: ");
        quantity = sc.nextInt();

        total = (int)(price*quantity);

        System.out.println("Thanks For buying a " + name + " Your Total is $" + total);







    }

}


