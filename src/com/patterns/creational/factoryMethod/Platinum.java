package com.patterns.creational.factoryMethod;

public class Platinum extends Card {
    private int pointsFactor = 2;

    public Platinum(String name) {
        super(name);
    }

    @Override
    public String getMainMessage() {
        return this.name + this.points * pointsFactor;
    }
}
