package com.adnan.javagenerics;

import java.util.ArrayList;

public class Main {
    // create a integer.
    public int num = 0;

    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
        list.add("hello java learner");
        list.add(String.valueOf(1));
        list.add(String.valueOf(2));
        // here we create a variable of string type but the object type is the integer.
        // giving an error - Integer cannot be cast to class
        String string = (String) list.get(0);
        String integer = list.get(1);
        // So to remove this error. By define the data type stored in the Arraylist
        System.out.println(string);
        System.out.println(integer);

    }
}
