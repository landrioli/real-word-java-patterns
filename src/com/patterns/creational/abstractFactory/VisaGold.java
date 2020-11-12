package com.patterns.creational.abstractFactory;

public class VisaGold extends CreditCard {
    private int pointsFactor = 1;

    public VisaGold(String name) {
        super(name);
    }

    @Override
    public String getMainMessage() {
        return this.name + this.points * pointsFactor;
    }
}