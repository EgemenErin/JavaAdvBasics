package org.example;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = num.nextInt();
        num.close();
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
}