import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game extends FileReader{
    static Random random = new Random();

    //Get a random word
    public static void getRandomWord() {

        //Call method getAllWords
        getAllWords();

        //Use getAllWords to get the size
        int randomWord = random.nextInt(getAllWords().size());

    }

    public void showRandomWord(){



    }

    //See if the players guess is in the word
    public static void printGuessedLetter(){

        for (int i = 0; i < getRandomWord; i++) {

        }
    }
}
