package com.company;
import java.util.Scanner;

public abstract class Rand {
    private int n;
    private Scanner input;

    public Rand(){
        this.n = 0;
        this.input = new Scanner(System.in);
    }

    public void userInput() {
        System.out.print("Number of repetitions: n = ");
        this.n = input.nextInt();
    }

    public abstract void rand();
    public int getN() {return n;}
}
