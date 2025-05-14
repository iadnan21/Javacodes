package com.adnan.polymorphism;

class SuperClass {
    public static void display() {
        System.out.println("Static method of the super class");
    }

    public void print() {
        System.out.println("Non-static or instance method of the super class");
    }
}

class SubClass extends SuperClass {
    public static void display() {
        System.out.println("Static method of the sub class");
    }

    public void print() {
        System.out.println("Non-static or instance method of the sub class");
    }
}

public class StaticCantOverride {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();

        // Static methods are resolved at compile-time based on the reference type
        obj.display(); // Calls SuperClass's display method

        // Non-static methods are resolved at runtime based on the actual object
        obj.print(); // Calls SubClass's print method
    }
}
