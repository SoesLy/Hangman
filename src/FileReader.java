import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
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
    public static ArrayList<String> getStoredWords() {
        addFileWords();
        return storedWords;
    }

}
