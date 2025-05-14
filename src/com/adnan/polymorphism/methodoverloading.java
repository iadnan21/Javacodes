package com.adnan.polymorphism;

public class methodoverloading {
    /// parameterised constructor
    int methodoverloading(int a, int b, int c){
        return a+b+c;
    }
    /// default constructor
    int methodoverloading(){
        return 0;
    }
    public static void main(String[] args) {
        /// compile time polymorphism / static polymorphism
        /// in the method overloading basically a constructor is created
        methodoverloading num = new methodoverloading();
        System.out.println(num.methodoverloading());
        System.out.println(num.methodoverloading(1,2,3));
    }
}
