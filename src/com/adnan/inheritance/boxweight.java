package com.adnan.inheritance;

public class boxweight extends box{
    int weight;

    boxweight(){
        this.weight = -1;
    }

    boxweight(int length, int breadth, int height, int weight){
        /// when we use "super" keyword , the parent class argumented constructor is been called.
//        super(length, breadth, height); in this case the default constructor will be called. here box() from the box.java
        super(length, breadth, height);
        this.weight = weight;


    }
}
