package com.adnan.javainterfaces;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("PowerEngine start");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine stop");
    }

    @Override
    public void power() {
        System.out.println("PowerEngine power");
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine acc");
    }
}
