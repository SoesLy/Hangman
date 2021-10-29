import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Getting ArrayList from Game-class available in main
        ArrayList arrayPlayer = Game.playersGuesses;
        //Starting at 0 and count up after ever mistake
        int wrongGuesses = 0;

        //Welcome intro
        System.out.println("Hello, and welcome to Hangman 💀");
        System.out.println("The theme is...: ");
        System.out.println("computer science," + "\n" + "and you have 6 tries. Good luck! 💀");
        System.out.println("");
        System.out.println("Please press 'enter' to start the game");
        scanner.nextLine();

        //Start the game

        //Getting ArrayList of cs words
        FileReader.getStoredWords();
        ArrayList words = Game.getStoredWords();


        //Getting a random word
        String randomWord = Game.getRandomWord();
        Game.wordOfTheGame = randomWord;

        //Show underscore instead of letter
        String status = Game.wordsToLines(Game.wordOfTheGame);
        System.out.println("CS word: " + status);

        //Show letter instead of underscore
        String wordIntoLines = Game.wordsToLines(Game.wordOfTheGame);

        //The user starts their play
        //The program will run if the user has guess wrong less then 6 times
        while (wrongGuesses < 6 && !status.equals(Game.wordOfTheGame)) {

            System.out.println("Please guess a letter...");
            String guess = scanner.nextLine();
            //Making the string to a char
            char charGuess = guess.charAt(0);
            Game.addWordToGuessList(charGuess);

            if (Game.wordOfTheGame.contains(guess)) {


            } else {
                wrongGuesses++;
                System.out.println("Wrong! Try again!");
            }

            System.out.println(status); //Can't get the replacing the underscores to letters to work//
            System.out.println("Used letters: " + arrayPlayer);
        }

        Game.result();
    }
}