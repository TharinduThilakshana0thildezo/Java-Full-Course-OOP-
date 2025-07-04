package com.company;

public class Circle extends Shape {
    int radius;

    @Override
    public int getArea(){
        return(int)(3.14*radius*radius);

    }
}
