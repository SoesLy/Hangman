import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FileReader {

    static Random random = new Random();
    public static ArrayList<String> storedWords = new ArrayList<String>();

    //A method that adds my file to the arrayList
    private static void addFileWords() {

        File words = new File("resources/cs words.csv");

        Scanner scanner;
        {
            try {
                scanner = new Scanner(words);
                while (scanner.hasNext()) {
                    storedWords.add(scanner.next());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                e.printStackTrace();
            }
        }
    }
    //Method to call my arrayList
    //public static ArrayList<String> getAllWords() {
        //addFileWords();
        //return storedWords;
    //}

    //Get a random word
    public static String getRandomWord() {

        //Use storedWords to get the size
        String randomWord = storedWords.get(random.nextInt(storedWords.size()));
        System.out.println(randomWord);

        return randomWord;
    }
}
