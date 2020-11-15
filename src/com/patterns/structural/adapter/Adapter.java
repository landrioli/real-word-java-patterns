package com.patterns.structural.adapter;

public class Adapter extends Target {
    private Adaptee _adaptee;

    public Adapter(Adaptee adaptee) {
        this._adaptee = adaptee;
    }

    @Override
    public void Run(){
        _adaptee.SpecificRun();
    }
}
