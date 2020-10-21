package com.company;

public class Dice extends Rand{

    public void rand(){
        int n = getN();

        for(int i=1; i<=n; i++) {
            int c1 = (int)(Math.random()*6)+1;
            System.out.print(c1 + " ");
        }

        System.out.println();
    }
}
