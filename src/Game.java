import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    public static String getRandomWord(ArrayList<String> words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.size());

        return words.get(randomIndex);

    }

    private String wordToFind;

    private char[] wordFound;
}
