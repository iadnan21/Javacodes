package com.adnan.extenddemo2;
// implements is used to implements the interface methods.
// here to implements the interface we can override the interface.
// A and B interface is implements in the Main class.
public class Main implements B {
    // here overide of the (fun) interface.
    // To implements the interface it is not neccessary to add @override
    @Override
    public void fun() {

    }

    // here overide of the (greeting) interface.
    @Override
    public void greeting() {

    }

    public static void main(String[] args){
        Main obj = new Main();
        // call by the name of the interface.
        A.greeting();
    }
}
