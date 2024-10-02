package org.example;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitSum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            digitSum += digit;
            temp /= 10;
        }

        int totalSum = digitSum + number;

        System.out.println("Sum of digits is: " + totalSum + " (" + digitSum + " + " + number + ")");

        scanner.close();
    }

}
