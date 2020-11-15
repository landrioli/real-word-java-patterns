package com.patterns.structural.decorator;

public class WaterWashDecorator implements CarWash {
    @Override
    public void Wash() {
        Wet();
    }

    private void Wet() {
        System.out.println("Water Washing Executed");
    }
}
