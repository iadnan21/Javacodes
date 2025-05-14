package com.adnan.polymorphism;
/// parent class
class A {
public void show1()
{
    System.out.println("in a show1 of class a");
}
}
/// child class
class B extends A
{
public void show2()
{
        System.out.println("in a show2 of class b");
}
}
public class upcasting {
    public static void main(String[] args) {
        /// A obj = new A();
        /// here (obj) refrence of A and the object of A (right hand side).
        /// upcasting
        /// refrence(type) of A and the object of B.
        /// A -> parent class
        /// B -> clild class
        A obj = (A) new B();
        obj.show1();
        /// downcasting
        /// here the refrence obj1 is of B but obj refrence of A which is the refrence of B.
        B obj1 = (B) obj;
        obj1.show2();
    }
}
