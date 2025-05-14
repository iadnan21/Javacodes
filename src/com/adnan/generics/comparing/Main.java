package com.adnan.generics.comparing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(21,461.5445f);
        Student student2 = new Student(22,46452.45f);
        Student student3 = new Student(23,463545.45f);
        Student student4 = new Student(24,445554.45f);
        Student student5 = new Student(25,41565.450f);
        Student student6 = new Student(26,4654456.45f);

        Student[] list1 = {student1, student2, student3, student4, student5, student6};
        // print the marks.
        System.out.println(Arrays.toString(list1));
        Arrays.sort(list1);
        System.out.println(Arrays.toString(list1));

        if(student1.compareTo(student2) < 0){
            System.out.println("student2 has more marks");
        }
        else{
            System.out.println("student1 has more marks");
        }
    }
}
