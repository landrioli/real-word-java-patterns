package com.patterns.creational.factoryMethod;

public class Gold extends Card {
    private int pointsFactor = 1;

    public Gold(String name) {
        super(name);
    }

    @Override
    public String getMainMessage() {
        return this.name + this.points * pointsFactor;
    }
}