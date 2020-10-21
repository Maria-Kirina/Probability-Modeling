package com.company;
import java.util.*;

public class RandomingProcess {
    public static final Map<String, String> TYPE;
    static {
        TYPE = new HashMap<String, String>();
        TYPE.put("d", "Dice");
        TYPE.put("co", "Coin");
        TYPE.put("ca", "Playing card");
    };

    public static void intro() {
        System.out.println("All the values are displayed in this format: name (user input).\n");
    }

    public static Rand getType(Scanner input) {
        String type = "";
        RandomFactory factory = new RandomFactory();

        System.out.println("The types of item drop probability that can be used are listed below");
        System.out.println("\tDice(d)");
        System.out.println("\tCoin(co)");
        System.out.println("\tPlaying card(ca)\n");

        System.out.print("What type do you want? ");
        type = input.nextLine();
        System.out.println();

        while (!TYPE.containsKey(type)) {
            System.out.println("Input was wrong! Please repeat");
            System.out.print("What type do you want? ");
            type = input.nextLine();
            System.out.println();
        }

        return factory.getRandom(TYPE.get(type));
    }

    public static void randomingProcess(Scanner input) {
        Rand rand = getType(input);
        boolean flag = true;

        while (flag) {
            String repeat = "";

            System.out.println("These are your choices of units:");

            rand.userInput();

            System.out.println("\nThe result: ");
            rand.rand();
            System.out.print("\nDo you want to repeat? Yes(y) or No(n)? ");
            repeat = input.nextLine();
            System.out.println();

            while (!repeat.toLowerCase().startsWith("n") && !repeat.toLowerCase().startsWith("y")) {
                System.out.println("Please enter Yes(y) or No(n)!");
                System.out.print("Do you want to convert another unit? Yes(y) or No(n)? ");
                repeat = input.nextLine();
            }

            if (repeat.toLowerCase().startsWith("n")) {
                flag = false;
            }
        }
    }
}