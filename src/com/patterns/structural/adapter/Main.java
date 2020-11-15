package com.patterns.structural.adapter;

public class Main {
    public static void main(String[] args){
        Target obj = new Adapter(new Adaptee());
        obj.Run();
    }
}
