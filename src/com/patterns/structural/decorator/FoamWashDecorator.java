package com.patterns.structural.decorator;

public class FoamWashDecorator extends CustomWashDecorator {
    public FoamWashDecorator(CarWash washStep) {
        super(washStep);
    }

    @Override
    public void Wash() {
        super._washStep.Wash();
        Foam();
    }

    private void Foam() {
        System.out.println("Foam Hashing Executed");
    }
}
