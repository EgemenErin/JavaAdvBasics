package org.example;

import java.util.Scanner;

public class Q2 {

    // Define the enum at the class level, outside of the main method
    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    public static void main(String[] args) {
        Scanner fav = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 4 to select a season: ");
        int choice = fav.nextInt();

        Season selectedSeason;
        switch (choice) {
            case 1:
                selectedSeason = Season.SPRING;
                break;
            case 2:
                selectedSeason = Season.SUMMER;
                break;
            case 3:
                selectedSeason = Season.AUTUMN;
                break;
            case 4:
                selectedSeason = Season.WINTER;
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                return;
        }
        System.out.println("You like: " + selectedSeason);
        fav.close();
    }
}
