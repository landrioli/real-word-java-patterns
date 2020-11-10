package com.patterns.creational.factoryMethod;

public class Main {
    public static void main(String[] args){
        Card card = CardFactory.getCard(CardType.GOLD);
        System.out.println(card.getMainMessage());

        card = CardFactory.getCard(CardType.PLATINUM);
        System.out.println(card.getMainMessage());

        card = CardFactory.getCard(CardType.DIAMOND);
        System.out.println(card.getMainMessage());
    }
}
