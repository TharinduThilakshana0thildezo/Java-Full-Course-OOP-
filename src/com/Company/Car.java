package com.Company;

public class Car extends Vehicle {
    int ndoors;

    public void showcardetails(){
        name="BMW";
        color="Black";
        nwheels=4;
        ndoors=4;
        seats=6;

        System.out.println("Car name: "+name);
        System.out.println("Car color: "+color);
        System.out.println("Car wheels: "+nwheels);
        System.out.println("Car doors: "+ndoors);
        System.out.println("Car seats: "+seats);
    }



}
