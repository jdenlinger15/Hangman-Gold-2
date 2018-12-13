

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        boolean again;
        int numberoftries;
        numberoftries = 15;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String guessedLetter;
        int playerscore;
        int computerscore;
        playerscore = 0;
        computerscore = 0;
        String againn;
        String phrase;
        int wrong;
        String secretWord;
        boolean guessedWord;


        System.out.println("This is a game called Hangman");





        do {
            secretWord = "supercalifragilisticexpialidocious";
            wrong = 0;
            again = false;
            guessedWord=false;
            phrase=createLines(secretWord);


            while (wrong<numberoftries &&!guessedWord) {
                System.out.println("Guess a letter and I will tell you if it's correct or incorrect.");
                guessedLetter = keyboard.nextLine();
                System.out.println(phrase);
                if (checkLetter(guessedLetter, secretWord)) {
                    System.out.println("That is correct.");
                    phrase=enterGuessIntoGuessPhrase(secretWord, guessedLetter, phrase);
                } else {
                    System.out.println("That is incorrect.");
                    wrong++;
                }
                if (secretWord.equals(phrase)){
                    guessedWord=true;
                }

                displayHangman(wrong);
            }
            gameover(1);

            againn = "";
            System.out.println("Your score is "+playerscore+" my score is "+computerscore+".");
            System.out.println("Would you like to play again? (yes or no)");
            againn = keyboard.next().toLowerCase();
        }while
(againn.equals("yes"));
        System.out.println("Your final score was "+playerscore+".");
        System.out.println("My final score was "+computerscore+".");
        System.out.println("Thank you for playing Hangman.");





    }
    public static String createLines(String word){
        String dashedLines="";
        for(int i=0;i<word.length();i++){
            dashedLines=dashedLines+"-";
        }
        return dashedLines;
    }

    public static String enterGuessIntoGuessPhrase(String word, String guess, String guessPhrase){
        for(int position = 0; position<word.length(); position ++){
            if(guess.charAt(0)==word.charAt(position)){
                guessPhrase = guessPhrase.substring(0, position)+guess+
                        guessPhrase.substring(position+1);
            }
        }
        return guessPhrase;
    }

    public static boolean checkLetter(String letter, String secretWord){
        if(secretWord.contains(letter)){
            return true;
        }
        else{
            return false;
        }
    }
    public static int gameover (Scanner keyboard){
        for (int i = 0; i < 2; i++){
            gameover(i);
        }
        switch (keyboard.nextLine()){
            default:
                return 1;
        }
    }


    public static int display (Scanner keyboard) {
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
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 1:
                System.out.println("+--------+");
                System.out.println("|        |");
                System.out.println("O        |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 2:
                System.out.println("+--------+");
                System.out.println("|        |");
                System.out.println("O        |");
                System.out.println("|        |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 3:
                System.out.println("+--------+");
                System.out.println("|        |");
                System.out.println("O        |");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 4:
                System.out.println("+--------+");
                System.out.println("|        |");
                System.out.println("O        |");
                System.out.println("|\\       |");
                System.out.println("|        |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 5:
                System.out.println("+--------+");
                System.out.println("  |      |");
                System.out.println("  O      |");
                System.out.println(" /|\\     |");
                System.out.println("  |      |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 6:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("  |        |");
                System.out.println("  |        |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 7:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ |        |");
                System.out.println("  |        |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 8:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ | \\      |");
                System.out.println("  |        |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 9:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ | \\      |");
                System.out.println("  |        |");
                System.out.println(" /         |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 10:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ | \\      |");
                System.out.println("  |        |");
                System.out.println(" / \\       |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 11:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ | \\      |");
                System.out.println("  |        |");
                System.out.println(" / \\       |");
                System.out.println("|          |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 12:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ | \\      |");
                System.out.println("  |        |");
                System.out.println(" / \\       |");
                System.out.println("|   |      |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 13:
                System.out.println("   +--------+");
                System.out.println("   |        |");
                System.out.println("   O        |");
                System.out.println("  /|\\       |");
                System.out.println(" / | \\      |");
                System.out.println("   |        |");
                System.out.println("  / \\       |");
                System.out.println(" |   |      |");
                System.out.println("_|          |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                break;

            case 14:
                System.out.println("   +--------+");
                System.out.println("   |        |");
                System.out.println("   O        |");
                System.out.println("  /|\\       |");
                System.out.println(" / | \\      |");
                System.out.println("   |        |");
                System.out.println("  / \\       |");
                System.out.println(" |   |      |");
                System.out.println("_|   |_     |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                break;

            case 15:
                System.out.println("   +--------+");
                System.out.println("   |        |");
                System.out.println("   O        |");
                System.out.println("  /|\\       |");
                System.out.println(" / | \\      |");
                System.out.println("   |        |");
                System.out.println("  / \\       |");
                System.out.println(" |   |      |");
                System.out.println("_|   |_     |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                break;





        }

        }





    public static void gameover(int gameOver){
        switch (gameOver){
            case 1:
                System.out.println("   _____                         ____                 \n" +
                        "  / ____|                       / __ \\                \n" +
                        " | |  __  __ _ _ __ ___   ___  | |  | |_   _____ _ __ \n" +
                        " | | |_ |/ _` | '_ ` _ \\ / _ \\ | |  | \\ \\ / / _ \\ '__|\n" +
                        " | |__| | (_| | | | | | |  __/ | |__| |\\ V /  __/ |   \n" +
                        "  \\_____|\\__,_|_| |_| |_|\\___|  \\____/  \\_/ \\___|_|   \n" +
                        "                                                      \n" +
                        "                                                      ");

        }
    }

}