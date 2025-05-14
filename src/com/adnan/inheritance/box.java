package com.adnan.inheritance;
// in this example we are taking the example of the box which can be any shape like square, cube and cuboid..
public class box {
    int length;
    int breadth;
    int height;
    ///  no args constructor..
    /// ALL VARIABLES ARE IN INTEGER..
    box (){
        super();
        this.length = -1;
        this.breadth = -1;
        this.height = -1;
    }
    ///  argument constructor
    /// for the square the constructor
    box(int side){
        this.length = side;
        this.breadth = side;
    }
    /// for the call of the cuboid.
 box (int l, int b, int h){
     this.length = l;
     this.breadth = b;
     this.height = h;
 }

 ///  passing the old constructor like box old
    box(box old){
        this.length = old.length;
        this.breadth = old.breadth;
        this.height = old.height;
    }
    public void information(){
        System.out.println("running the box.java");
    }
}
