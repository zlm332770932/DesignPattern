package com.limin.designparttern.singleton;

public class Test {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.printTest();
    }
}
