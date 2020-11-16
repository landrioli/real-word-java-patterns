package com.patterns.structural.facade;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InventoryFacade inventory = new InventoryFacadeImp(new InventoryLevelA(), new InventoryLevelB(), new InventoryLevelC());
        List<String> items = inventory.GetAll();
        for(String item : items){
            System.out.println(item);
        }
    }
}
