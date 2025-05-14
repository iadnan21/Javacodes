package com.adnan.Collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class toArray {
     public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2578875);
        list.add(25464885);
        list.add(5545115);
        list.add(45554558);
        // reversing the list.
//        System.out.println(list);
//         Collections.sort(list);
//         System.out.println(list);
//         Collections.reverse(list);
//         System.out.println(list);
///        Try to do sorting with the comparator
        // convert list to array
        Object[] array = list.toArray();
        list.toArray(new Integer[0]);

    }
}
