import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome to Hangman 💀");
        System.out.println("The theme is computer science, and you have 6 tries to guess the word. Good luck!");
        System.out.println("Please guess a letter....");
        char guessedLetter = scanner.next().charAt(0);


    }
}
