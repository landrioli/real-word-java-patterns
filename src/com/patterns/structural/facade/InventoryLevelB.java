package com.patterns.structural.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventoryLevelB {
    public List<String> GetItems(){
        return new ArrayList<String>(Arrays.asList("Item 5B","Item 6B"));
    }
}
