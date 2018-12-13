Hangman-Alpha1

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        String guessedLetter;
        Scanner keyboard;

        int minimumWordCount;
        int maximumWordCount;
        int numberMisses = 0;


        minimumWordCount = 2;

        keyboard = new Scanner(System.in);
        System.out.println("Hello! Welcome to Hangman.");
        System.out.println("The rules are simple, you have 15 tries to guess the correct words/phrase.");
        System.out.println("If you don't guess the right words/phrase in the correct amount or tries, you lose.");
        System.out.println("If you guess the right words/phrase in the correct amount of tries, you win.");


        System.out.println("There are 3 types of Difficulty. 1 for Easy, 2 for Medium, and 3 for Hard. ");
        maximumWordCount = chooseDifficulty(keyboard);

        for (int i = 0; i < 15; i++) {
            displayHangman(i);
        }

        displayHangman(numberMisses);

        numberMisses++;
        displayHangman(numberMisses);

    }

    public static int chooseDifficulty (Scanner keyboard){
        System.out.println("Choose a difficulty\n1 for easy\n2 for medium\n3 for hard");
        switch (keyboard.nextInt()) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 6;
            default:
                return 2;

        }
    }

    public static void displayHangman(int tries){
        switch(tries){
            case 0:
            default:
                System.out.println("+--------+");
                System.out.println("|        |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

        }





    }
}
