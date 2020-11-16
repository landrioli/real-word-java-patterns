package com.patterns.structural.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventoryLevelA {
    public List<String> GetItems(){
        return new ArrayList<String>(Arrays.asList("Item 1A","Item 2A","Item3A"));
    }
}
