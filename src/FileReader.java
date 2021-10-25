import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    ArrayList<WordsList> allWords = new ArrayList<WordsList>();

    public static String accessWords() {

        File words = new File("resources/cs words.csv");

        Scanner scanner;
        {
            try {
                scanner = new Scanner(words);
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                e.printStackTrace();
            }

            return "";

        }
    }
}
