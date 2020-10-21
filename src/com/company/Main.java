package com.company;
/**
 * Program: Probability Modeling
 * @author: Masha Kirina
 *
 * Description: This program simulates the probability of tossing coins, dice and pull out the cards.
 */
import java.util.Scanner;
import static com.company.RandomingProcess.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        intro();

        while (flag) {
            String answer = "";

            randomingProcess(input);

            System.out.print("\nDo you want to find the probability of another item being dropped? Yes(y) or No(n)? ");
            answer = input.nextLine();
            System.out.println();

            while (!answer.toLowerCase().startsWith("n") && !answer.toLowerCase().startsWith("y")) {
                System.out.println("Please choose Yes(y) or No(n)!");
                System.out.print("Do you want to find the probability of another item being dropped? Yes(y) or No(n)? ");
                answer = input.nextLine();
            }

            if (answer.toLowerCase().startsWith("n")) {
                flag = false;
            }
        }
    }
}
