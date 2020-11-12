package com.patterns.creational.abstractFactory;

public class VisaPlanitum extends CreditCard {
    private int pointsFactor = 2;

    public VisaPlanitum(String name) {
        super(name);
    }

    @Override
    public String getMainMessage() {
        return this.name + this.points * pointsFactor;
    }
}
