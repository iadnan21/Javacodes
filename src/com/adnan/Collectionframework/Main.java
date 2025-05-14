package com.adnan.Collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        /// list (arraylist) is asynchronous and a multi threaded.
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        System.out.println("iih");
        // vector
        /// vector is synchronous and a single threaded..
        List<Integer> vector = new Vector<>();
        vector.add(454);
        vector.add(7855);
        System.out.println(vector);
    }
}
