package com.adnan.inheritance;

public class Main {
    public static void main(String[] args) {
// calling the default constructor
        box obj_box = new box();
        System.out.println(obj_box.length + " " + obj_box.breadth + " " + obj_box.height);
// making the box of the side 10
    box obj_box1 = new box(10);
        System.out.println(obj_box1.length + " " + obj_box1.breadth);
// making the instance the sub class and accessing the attribute of the parent class..
   boxweight box3 = new boxweight(4,5,8,72);
        System.out.println(box3.length + " " + box3.breadth + " " + box3.height + " " + box3.weight);
        System.out.println(box3.length + box3.breadth + box3.height + box3.weight);
        /// new example of the refrence variable //
        /// here on the right hand side the object is created of boxweight (child class)
        /// on the left hand side the type of refrence variable of (parent class) is used to detemine what type of member can be access.
        /// same as like when our parents were refrence us on parent teacher meeting
        /// parent class(super) refrence variable = new child class (instance variable).
        /// refrence to a sub class object is assigned to a super class refrence variable. only have those part of object which is present in the super class
        /// in this the child is object and the parent is the refence variable..
        /// refrence of box and object of boxweight
        box box4 = new boxweight(45,878,865,8548);
        System.out.println(box4.length + " " + box4.breadth + " " + box4.height);
        /// it can't be access why because it in not the part of the super class
        // System.out.println(box4.weight);
    }
}
