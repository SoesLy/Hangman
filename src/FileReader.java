import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    //Creating an ArrayList that stores my file
    public static ArrayList<String> storedWords = new ArrayList<String>();

    //Creating a method that adds my file to the ArrayList
    private static void fileWords() {
        File words = new File("resources/cs words.csv");

        try {
            Scanner scanner = new Scanner(words);
            while (scanner.hasNext()) {
                storedWords.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    //Method to call my arrayList
    public static ArrayList<String> getStoredWords() {
        fileWords();
        return storedWords;
    }
}
