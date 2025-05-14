package com.adnan.Collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aboutList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        ///  the object is of the child class i.e the class is arraylist
//        System.out.println(list.getClass().getName());

//        List<String> list1 = Arrays.asList("Monday", "Tuesday", "Wednesday");
//        System.out.println(list.getClass().getName());
//        System.out.println(list1);
        /// can't possible because the .asList give the fixed size list.
//        list1.add("Thrusday");
//        System.out.println(list1);
//        list1.set(1,"Thrusday");
//        System.out.println(list1);
        // .of List
        /// in this the elements can't be change or replace.Immutable list
//        List<Integer> integers = List.of(1, 2, 3, 4, 5);
//        System.out.println(integers.getClass().getName());
            list.add("Adnan");
            list.add("Danish");
            list.add("Chand");
            list.add("Rishabh");
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
        System.out.println(list);
        // list.remove(String.valueOf(1)); -> it doesn't work change it
        list.remove(1);
        // for the removing of the string data type just pass the index (in the string arraylist).
        System.out.println(list1);
        list1.remove(Integer.valueOf(1)); // -> it will work because here in .remove() the object is present
        // so we have to pass the class i.e. wrapper class (Integer.valueof()).
        System.out.println(list);
        System.out.println(list1);
        
    }
}
