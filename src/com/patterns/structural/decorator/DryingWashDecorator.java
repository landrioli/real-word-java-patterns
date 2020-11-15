package com.patterns.structural.decorator;

public class DryingWashDecorator extends CustomWashDecorator {
    public DryingWashDecorator(CarWash washStep) {
       super(washStep);
    }

    @Override
    public void Wash() {
        super._washStep.Wash();
        Dry();
    }

    private void Dry(){
        System.out.println("Drying Executed");
    }
}
