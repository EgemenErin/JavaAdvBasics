package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner wordsscanner = new Scanner(System.in);
        StringBuilder stringbuilder = new StringBuilder();
        String[] words = new String[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = wordsscanner.next().toLowerCase();
        }
        words[0] = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);
        for (String word : words) {
            stringbuilder.append(word).append(" ");
        }
        String sentence = stringbuilder.toString().trim();
        System.out.println("Constructed sentence: " + sentence);

        try (FileWriter writer = new FileWriter("sentence.txt")) {
            writer.write(sentence);
            System.out.println("Sentence written to file: sentence.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        wordsscanner.close();
    }

}
