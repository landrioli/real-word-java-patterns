package com.patterns.behavioral.adapter;

import com.patterns.creational.builder.Message;
import com.patterns.creational.builder.Priority;

public class Main {
    public static void main(String[] args){
        Target obj = new Adapter(new Adaptee());
        obj.Run();
    }
}
