package com.company;

public class Main {
    public static void main(String[] args) {
        int num = 13;
        double d = 12.22;
        String str = "Hello";

        Integer i = new Integer(num); //boxing -Wrapping
        Integer h = 14; //auto boxing - warapping
        Integer l = 21;
        Integer m =new Integer((int) d);

        System.out.println(i.intValue());//unboxing
        System.out.println(h.intValue());// and unwrapping
        System.out.println(l);
        System.out.println(d);


    }
}