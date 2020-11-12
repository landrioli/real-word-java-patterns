package com.patterns.creational.abstractFactory;

public class Main {
    public static void main(String[] args){
        CreditCard card = CreditCardFactory.getCreditCardFactory(800).getCard(CardType.GOLD);
        System.out.println(card.getMainMessage());

        CreditCard cardTwo = CreditCardFactory.getCreditCardFactory(400).getCard(CardType.GOLD);
        System.out.println(card.getMainMessage());

        CreditCard cardThree = CreditCardFactory.getCreditCardFactory(400).getCard(CardType.DIAMOND);
        System.out.println(card.getMainMessage());
    }
}
