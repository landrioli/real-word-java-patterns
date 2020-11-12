package com.patterns.creational.abstractFactory;

public class MasterGold extends CreditCard{
    private int pointsFactor = 1;

    public MasterGold(String name) {
        super(name);
    }

    @Override
    public String getMainMessage() {
        return this.name + this.points * pointsFactor;
    }
}
