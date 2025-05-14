package com.adnan.nestedinterface;

public class A {
    public interface Nestedinterface {
        boolean isEven(int num);
    }
}

class B implements A.Nestedinterface {
    @Override
    public boolean isEven(int num) {
        return (num & 1) == 0;
    }
}

