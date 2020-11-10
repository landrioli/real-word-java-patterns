package com.patterns.creational.factoryMethod;

public abstract class Card {
    protected final int points = 1;
    protected String name;

    public Card(String name){
        this.name = name;
    }

    public abstract String getMainMessage();
}
