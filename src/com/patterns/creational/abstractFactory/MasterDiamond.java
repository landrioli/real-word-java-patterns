package com.patterns.creational.abstractFactory;

public class MasterDiamond extends CreditCard {
    private int pointsFactor = 1;

    public MasterDiamond(String name) {
        super(name);
    }

    @Override
    public String getMainMessage() {
        return this.name + this.points * pointsFactor;
    }
}
