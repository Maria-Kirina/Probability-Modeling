package com.company;

import java.util.ArrayList;

public class Cards extends Rand{
    public void randCards(int suits, int rank){
        ArrayList<String> Suits = new ArrayList<>();
        Suits.add("Hearts");
        Suits.add("Diamonds");
        Suits.add("Clubs");
        Suits.add("Spades");

        ArrayList<String> Rank = new ArrayList<>();
        Rank.add("6");
        Rank.add("7");
        Rank.add("8");
        Rank.add("9");
        Rank.add("10");
        Rank.add("Jack");
        Rank.add("Queen");
        Rank.add("King");
        Rank.add("Ace");

        System.out.println(Rank.get(rank) + " " + Suits.get(suits) + " ");
    }

    public void rand(){
        int n = getN();

        for(int i=1; i<=n; i++) {
            int c1 = (int)(Math.random()*4);
            int c2 = (int)(Math.random()*9);
            randCards(c1, c2);
        }
    }
}