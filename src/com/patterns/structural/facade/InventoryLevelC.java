package com.patterns.structural.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventoryLevelC {
    public List<String> GetItems(){
        return new ArrayList<String>(Arrays.asList("Item 10C"));
    }
}
