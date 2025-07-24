package com.company;

public class Test {

    public void show(){
        System.out.println("This is show() method1");
    }
    public void show(int number){//we can overload methods by giving a diff paras
        System.out.println("This is show() method2: " + number);
    }
}

//and also return type must be same, if 1st one is void 2nd one must be void too