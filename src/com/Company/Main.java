package com.Company;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        van van1 = new van();
        bike bike1 = new bike();

        car1.showcardetails();
        System.out.println();
        van1.vanDetails();
        System.out.println();
        bike1.showbikedetails();
        System.out.println();

        car1.accelerate();
        System.out.println();
        bike1.start();

    }
}
