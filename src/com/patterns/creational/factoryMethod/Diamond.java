package com.patterns.creational.factoryMethod;

public class Diamond extends Card {
    private int pointsFactor = 3;

    public Diamond(String name){
        super(name);
    }

    @Override
    public String getMainMessage() {
        return this.name + this.points * pointsFactor;
    }
}
