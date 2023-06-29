package homeworkTask.HW_29_06;

import java.util.Scanner;

public class ScannerText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the firs word: ");
        String word1 = scanner.next();

        System.out.println("Enter the second word: ");
        String word2 = scanner.next();

        if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
            System.out.println("The numbers of letters in words must be even!");
            return;
        } else {
            String firstHalf = word1.substring(0, word1.length() / 2);
            String secondHalf = word2.substring(word2.length() / 2);
            System.out.println("Result: " + (firstHalf + secondHalf));
        }
    }
}
