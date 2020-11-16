package com.patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class InventoryFacadeImp implements InventoryFacade{
    private InventoryLevelA _one;
    private InventoryLevelB _two;
    private InventoryLevelC _three;

    public InventoryFacadeImp(InventoryLevelA _one, InventoryLevelB _two, InventoryLevelC _three) {
        this._one = _one;
        this._two = _two;
        this._three = _three;
    }

    @Override
    public List<String> GetAll() {
        List<String> result = new ArrayList<String>();

        result.addAll(_one.GetItems()); //Querying SubSystem A
        result.addAll(_two.GetItems()); //Querying SubSystem B
        result.addAll(_three.GetItems()); //Querying SubSystem C

        return result;
    }
}
