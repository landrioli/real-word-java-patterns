package com.patterns.creational.factoryMethod;

public class CardFactory {

    public static Card getCard(CardType type){
        switch(type) {
            case GOLD:
                return new Gold("My Customized Gold");
            case PLATINUM:
                return new Platinum("My Customized Planinum");
            case DIAMOND:
                return new Diamond("My Customized Diamond");
            default:
                throw new IllegalArgumentException("The CardType is not valid.");
        }
    }
}
