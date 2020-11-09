package com.patterns.creational.builder;


public class Main {
    public static void main(String[] args){
        Message message = new Message.MessageBuilder()
                .WithHeader("Leandro")
                .WithBody("Programming")
                .WithFooter("Andrioli")
                .WithPriority(Priority.HIGH)
                .Build();

        System.out.println(message);
    }
}
