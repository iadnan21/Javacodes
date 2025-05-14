package com.adnan.polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("I am in the main class");
        circles cir = new circles();
        triangles tri = new triangles();
        squares sq = new squares();

        cir.area();
    }
}
