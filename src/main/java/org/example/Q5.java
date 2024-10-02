package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        int letterCount = 0;
        int spaceCount = 0;
        int wordCount = 0;

        String[] words = userInput.split("\\s+");
        wordCount = userInput.length();

        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isSpaceChar(ch)) {
                spaceCount++;
            }
        }

        System.out.println("Letters: " + letterCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Words: " + wordCount);

        scanner.close();
    }

}
