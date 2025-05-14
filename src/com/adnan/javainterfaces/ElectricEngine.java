package com.adnan.javainterfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("electricengine start");
    }

    @Override
    public void stop() {
        System.out.println("electricengine stop");

    }

    @Override
    public void power() {
        System.out.println("electricengine power");

    }

    @Override
    public void acc() {
        System.out.println("electricengine acc");

    }
}
