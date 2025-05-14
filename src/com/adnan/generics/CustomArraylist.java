package com.adnan.generics;

import java.util.ArrayList;

public class CustomArraylist {
    private int size = 0;
    private int[] arr1;
    public CustomArraylist() {
        int DEFAULT_VALUE = 10;
        int[] arr1 = new int[DEFAULT_VALUE];
    }
    public void add(int num){
        if(isfull()){
            resize();
        }
        else{
            arr1[size++] = num;
        }
    }

    private void resize() {
        int[] temp = new int[arr1.length * 2];
        for(int i = 0; i < arr1.length; i++) {
           temp[i] = arr1[i];
        }
        arr1 = temp;
    }

    private boolean isfull() {
        return size == arr1.length;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int remove(){
        return arr1[--size];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        arr1[index] = value;
    }
    public int get(int index){
        return arr1[index];
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println(al.indexOf(1));;
//        al.set(1,878450);
//        al.removeFirst();
//        System.out.println(al.size());
        CustomArraylist arraylist = new CustomArraylist();
    }
}
