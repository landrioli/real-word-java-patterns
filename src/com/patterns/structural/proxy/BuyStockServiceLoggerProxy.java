package com.patterns.structural.proxy;

public class BuyStockServiceLoggerProxy extends BuyStockService{
    private BuyStockService _service;

    public BuyStockServiceLoggerProxy() {
        this._service = new BuyStockServiceImp();
    }

    @Override
    void Buy(int value) {
        System.out.println("Buying stock");
        _service.Buy(value);
        System.out.println("Stock bought");
    }
}
