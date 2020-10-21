package com.company;

public class Coin extends Rand{

    public void rand(){
        int n = getN();

        for(int i=1; i<=n; i++) {
            int c1 = (int)(Math.random()*2)+1;
            if (c1 == 1) {
                System.out.print("Heads ");
            } else {
                System.out.print("Tails ");
            }
        }
    }
}
