package com.patterns.structural.decorator;

public abstract class CustomWashDecorator implements CarWash {
    protected CarWash _washStep;

    public CustomWashDecorator(CarWash washStep) {
        _washStep = washStep;
    }

    @Override
    public void Wash() {
        _washStep.Wash();
    }
}
