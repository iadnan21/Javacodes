package com.adnan.objectclone;

public class human implements Cloneable{
    int age;
    String name;
    String sex;
    int[] arr;

//    public human(human other) {
//        this.age = other.age;
//        this.name = other.name;
//        this.sex = other.sex;
//        this.arr  = new int[]{5484,64645,26459,623265,54596160};
//    }

    @Override
    public String toString() {
        return "human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public human(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.arr  = new int[]{5484,6465,2659,6235,5160};
    }
    public Object clone() throws CloneNotSupportedException{
        // this is the shallow copy.
        human twin = (human) super.clone();
//        return super.clone();
        // make a deep copy.
        // basically creating a new array.
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
