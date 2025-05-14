package com.adnan.abstractdemo;

public class abstractdaughter extends abstractparent{
   /// abstract child class.
    public abstractdaughter(int age) {
        super(age);
    }

    @Override
    void career(String name){
        System.out.println("I am a " + name);
    }

    @Override
    void partner(String name , int age){
        System.out.println(" i partner is " + name + " and he is " + age + " year old.");
    }
}
