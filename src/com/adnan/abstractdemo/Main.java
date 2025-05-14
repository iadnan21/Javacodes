package com.adnan.abstractdemo;

public class Main {
    public static void main(String[] args) {
            /// object of the child class
            abstractson son = new abstractson(30);
            /// abstract method call.
            son.career("doctor");
            son.partner("billi ellish", 25);
            /// even if we have constructor in the abstract class we can create the object of that class.
            // WHY CAN'T WE CREATE THE OBJECT OF THE ABSTRACT CLASS.
            // An abstract class in Java cannot be instantiated because it is designed to be incomplete,
            // often containing abstract methods without implementations.
            // This incompleteness means that creating an object of an abstract class would lead to a compilation error
            // since the abstract class does not provide a full implementation.
            /// means abstract class can't be instantiated.
            /// to do so we have to override the methods
            ///  like the given example below.
      /*  abstractparent father = new abstractparent(55) {
            @Override
            void career(String name) {

            }

            @Override
            void partner(String name, int age) {

            }
        };  */
    }
}
