package com.patterns.structural.proxy;


public class Main {
    public static void main(String[] args){
        BuyStockService proxy = new BuyStockServiceLoggerProxy();
        proxy.Buy(500);
    }
}
