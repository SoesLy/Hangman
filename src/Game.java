import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game extends FileReader {

    //Creating a new ArrayList for players guessed letters
    static ArrayList<Character> playersGuesses = new ArrayList<>();
    static Random random = new Random();
    static String wordOfTheGame;
    static String guess;

    //We start at 0 mistakes and go up
    private static int wrongGuesses = 0;

    //Get a random word
    public static String getRandomWord() {
        //Use storedWords from FileReader to get random word from ArrayList
        String randomWord = storedWords.get(random.nextInt(storedWords.size()));

        return randomWord;
    }

    //Change random word to lines
    public static String wordsToLines(String wordOfTheGame) {
        String status = "";
        //Run through a for loop to find it's size
        for (int i = 0; i < wordOfTheGame.length(); i++) {
            //Change the status from empty string to underscores
            status = status + "_";
        }
        return status;
    }

    //Inspired by Laura
    public static void updatingProgress() {
        StringBuilder newGameStatus = new StringBuilder();

        for (int i = 0; i < wordOfTheGame.length(); i++) {
            if (String.valueOf(wordOfTheGame.charAt(i)).equals(playersGuesses)) {
                newGameStatus.setCharAt(i, wordOfTheGame.charAt(i));
            }
        }
        newGameStatus.toString();
    }

    //Take the guessed letter from main-class and add it to ArrayList
    public static void addWordToGuessList(char guess) {
        playersGuesses.add(guess);
    }

    public static void result() {
        if (wrongGuesses == 6) {
            System.out.println("Oh oh, you lost 😟");
            System.out.println("The word was: " + wordOfTheGame);
        } else {
            System.out.println("Congrats, you guessed the right word: " + wordOfTheGame);
        }
    }
}
