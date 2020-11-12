package com.patterns.creational.abstractFactory;

public class VisaCardFactory extends CreditCardFactory{

    @Override
    public CreditCard getCard(CardType type) {
        switch(type) {
            case GOLD:
                return new VisaGold("My Customized Visa Gold");
            case PLATINUM:
                return new VisaPlanitum("My Customized Visa Planinum");
            default:
                throw new IllegalArgumentException("The CardType is not valid.");
        }
    }
}
