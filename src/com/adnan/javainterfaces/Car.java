package com.adnan.javainterfaces;

public class Car implements Brake, Engine, Media{
    @Override
    public void brake() {
        System.out.println("Brake");
    }

    @Override
    public void acc() {
        System.out.println("Acceleration");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void power() {
        System.out.println("Power");
    }
}
