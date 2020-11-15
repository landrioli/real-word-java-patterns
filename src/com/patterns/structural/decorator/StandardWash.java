package com.patterns.structural.decorator;

public class StandardWash implements CarWash {
    @Override
    public void Wash() {
        System.out.println("Standard Wash Executed");
    }
}
