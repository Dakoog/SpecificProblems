package string;

import java.io.*;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        File palindrome = new File("palindrome.txt");
        readingFile(palindrome);

        try (InputStreamReader input = new InputStreamReader(System.in)) {

            BufferedReader br = new BufferedReader(input);
            System.out.println();
            String text;
            System.out.println("Please, type your text if you want to check if that word or sentence is a palindrome");
            boolean stop = false;
            do {
                System.out.println("Your text it: ");
                text = br.readLine();
                text = text.toLowerCase();

                if (text.equalsIgnoreCase("finish")) {
                    stop = true;
                    System.out.println("The end. See you!");
                } else {
                    if (isPalindrome(text)) {
                        System.out.println(text.toUpperCase() + ": it is palindrome.");
                    } else {
                        System.err.println(text.toLowerCase() + ": it isn't palindrome");
                    }
                }
            } while (!stop);

        }
    }
    public static void readingFile(File file) throws FileNotFoundException {

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String palindromeContent = scanner.nextLine();
                System.out.println(palindromeContent);
            }
        }
    }
    public static boolean isPalindrome(String word) {
        word = word.replace(" ", "");
      int wordlength = word.length();
        for (int i = 0; i < wordlength / 2; i++) {
            if (word.charAt(i) != word.charAt(wordlength - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
