package com.adnan.abstractdemo;

public class abstractson extends abstractparent {
    /// abstract child class.
    public abstractson(int age) {
        super(age);
    }

    void career(String name){
         System.out.println("I am a " + name);
     }
     void partner(String name , int age){
         System.out.println(" i partner is " + name + " and she is " + age + " year old.");
     }
}
