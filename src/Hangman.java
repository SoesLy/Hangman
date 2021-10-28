import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        System.out.println("Hello and welcome to Hangman 💀");
        System.out.println("The theme is computer science, and you have 6 tries to guess the word. Good luck!");

        FileReader.getStoredWords();
        ArrayList words = Game.getStoredWords();
        //System.out.println(words); //REMOVE!!!
        String randomWord = Game.getRandomWord();
        System.out.println("/" + randomWord + "/");

       String statusInGame = Game.getWordInUnderscoresStatus();
        System.out.println(statusInGame);

        System.out.println("Please guess a letter....");
        String inputLetter = scanner.nextLine();







    }
}