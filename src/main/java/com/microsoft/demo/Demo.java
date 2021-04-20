package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        System.out.println("Here I am!!");
        if(flag){
            System.out.println("I am covered");
            return;
        }

        System.out.println("I am not covered");
    }
}
