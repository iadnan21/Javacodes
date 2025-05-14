package com.adnan.objectclone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        human man = new human(55,"Adnan","male");
        human twin = (human) man.clone();
//        System.out.println(man);
        System.out.println(man.age + " " + man.name + " " + man.sex);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 4859;
        System.out.println(Arrays.toString(twin.arr)); // now it a new array.
        System.out.println(Arrays.toString(man.arr));

    }
}
