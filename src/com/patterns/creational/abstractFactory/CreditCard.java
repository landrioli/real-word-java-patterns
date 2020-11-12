package com.patterns.creational.abstractFactory;

//AbstractProduct
public abstract class CreditCard {

    protected final int points = 1;
    protected String name;

    public CreditCard(String name){
        this.name = name;
    }

    public abstract String getMainMessage();
}
