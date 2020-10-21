package com.company;
public class RandomFactory {
    public Rand getRandom(String Type) {
        if (Type.equals("Dice")) {
            return new Dice();
        } else if (Type.equals("Coin")) {
            return new Coin();
        } else if (Type.equals("Playing card")) {
            return new Cards();
        }
        return null;
    }
}