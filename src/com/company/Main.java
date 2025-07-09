package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        String name;

        name = rand.nextInt()+"";
        System.out.println(name);
    }
}
