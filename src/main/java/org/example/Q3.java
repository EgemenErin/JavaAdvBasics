package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q3 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 100 numbers. Enter 0 to stop and display the results:");
        for (int i = 0; i < 100; i++) {
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }
        scanner.close();
        numbers.sort(Integer::compareTo);
        List<Integer> filteredNumbers = numbers.stream().filter(n -> n != 0).toList();
        System.out.println("Your numbers were: " + filteredNumbers);
        int sum = filteredNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);
        double average = filteredNumbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average: " + average);
    }
}
