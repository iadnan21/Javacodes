// Abstract class
package com.adnan.abstractdemo;
public abstract class abstractparent {

    int age;
    /// Contructor in the abstract class..
    /// abstract class can't have the abstract constructor.
    public abstractparent(int age) {
        this.age = age;

    }
    ///  if the class has more than one abstract methods than the class is become the abstract class..
    /// Can't create the object of the parent class.
    /// method 1
    abstract void career(String name);
    /// method 2
    abstract void partner(String name, int age);
}

