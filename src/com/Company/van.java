package com.Company;

public class van extends Vehicle {

    int ndoors;
    int loadcapacity;

    public void loadvan(){

        System.out.println("Loading van" );

    }
    public void vanDetails(){

        name="Toyota";
        color="White";
        nwheels=4;
        ndoors=4;
        loadcapacity=100;
        seats=10;

        System.out.println("Van name: "+this.name);
        System.out.println("Van color: "+this.color);
        System.out.println("Van nwheels: "+this.nwheels);
        System.out.println("Van loadcapacity: "+this.loadcapacity);
        System.out.println("Van loadcapacity loads: "+this.loadcapacity);
        System.out.println("Van seats: "+this.seats);


    }
}
