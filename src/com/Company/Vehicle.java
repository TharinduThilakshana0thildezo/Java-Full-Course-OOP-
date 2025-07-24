package com.Company;

public class Vehicle {

    protected String name;
    protected String color;
    protected int nwheels;
    protected int seats;

    protected  void start() {
        System.out.println("Starting Vehicle...");
    }
    protected void accelerate() {
        System.out.println("Accelerating Vehicle...");
    }
    protected void stop() {//break is system keyword
        System.out.println("Stopping Vehicle...");
    }


}
