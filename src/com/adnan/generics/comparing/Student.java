package com.adnan.generics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
//        System.out.println("compare to Running");
        /// here in the difference if the diff == 0; both are equal (have the same marks)
        /// if diff is < 0; o is bigger else o is smaller
        int diff = (int) (this.marks - o.marks);
        return diff;
    }
}
