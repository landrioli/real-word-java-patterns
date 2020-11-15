package com.patterns.structural.proxy;

public class BuyStockServiceImp extends BuyStockService{

    @Override
    void Buy(int value) {
        System.out.println("Buy Order Sent");
    }
}
