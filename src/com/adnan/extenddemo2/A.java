package com.adnan.extenddemo2;

public interface A {
    //call via the interface name
    static void greeting(){
        System.out.println("I am in the greeting method (override) in interface A");
    }
    default void fun(){
        System.out.println("hello i am in fun method (override) in the interface A");
    }
}
