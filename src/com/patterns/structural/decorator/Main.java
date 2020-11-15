package com.patterns.structural.decorator;

public class Main {
    public static void main(String[] args){
        CarWash wash = new StandardWash();
        wash.Wash();

        wash = new DryingWashDecorator(new FoamWashDecorator(new WaterWashDecorator()));
        wash.Wash();
    }
}
