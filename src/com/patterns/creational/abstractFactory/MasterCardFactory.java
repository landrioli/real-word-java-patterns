package com.patterns.creational.abstractFactory;

public class MasterCardFactory extends CreditCardFactory{
    @Override
    public CreditCard getCard(CardType type) {
        switch(type) {
            case GOLD:
                return new MasterGold("My Customized Master Gold");
            case DIAMOND:
                return new MasterDiamond("My Customized Master Planinum");
            default:
                throw new IllegalArgumentException("The CardType is not valid.");
        }
    }
}
