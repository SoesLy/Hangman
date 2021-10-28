import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game extends FileReader{

    //Creating a new ArrayList for players guessed letters
    static ArrayList<Character> playersGuesses = new ArrayList<>();
    static Random random = new Random();

    //Get a random word
    public static String getRandomWord() {

        //Use storedWords from FileReader to get random word from ArrayList
        String randomWord = storedWords.get(random.nextInt(storedWords.size()));

        return randomWord;
    }

    //Change random word to lines
    public static String getWordInUnderscoresStatus(){
        String status = "";
        for (int i = 0; i < randomWord().length(); i++) {
            status = status + "_" ;
        }
        return status;
            //If the letter is in the random word, replace letter for _

            }


    public static void hangman() {

    }

}
