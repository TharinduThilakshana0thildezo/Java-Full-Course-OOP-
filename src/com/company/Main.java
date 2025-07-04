package com.company;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();

        r1.length = 2341;
        r1.width = 34;
        c1.radius = 11562;

        System.out.println("Area of Rectangle is: " + r1.getArea());
        System.out.println("Area of Circle is: " + c1.getArea());



    }
}
