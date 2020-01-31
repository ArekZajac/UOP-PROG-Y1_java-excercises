package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Week14 {

    public static void main(String[] args) {
//        ageDiscount();
//        birthDiscount();
//        suggestedActivity();
//        evenNumbers();
//        primeNumbers();
//        sumLimit();
        numberSorter();
    }

    private static void ageDiscount() {
        System.out.println("Enter Age:");
        int age = new Scanner(System.in).nextInt();
        int discount = 0;
        if (age < 45) {
            discount = 25;
        } else if (age < 60) {
            discount = 45;
        } else {
            discount = 70;
        }
        System.out.println("Discount: " + discount + "%");
    }

    private static void birthDiscount() {
        System.out.println("Enter birth year:");
        int year = new Scanner(System.in).nextInt();
        int discount = 0;
        if (year < 1967) {
            discount = 30;
        } else {
            discount = 45;
        }
        System.out.println("Discount: " + discount + "%");
    }

    private static void suggestedActivity() {
        System.out.println("Enter a number from 1 to 6");
        int number = new Scanner(System.in).nextInt();
        switch (number) {
            case 1:
                System.out.println("Go out with friends");
                break;
            case 2:
                System.out.println("Walk the dog");
                break;
            case 3:
                System.out.println("Do homework");
                break;
            case 4:
                System.out.println("Watch a movie");
                break;
            case 5:
                System.out.println("Read a book");
                break;
            case 6:
                System.out.println("Play a game");
                break;
            default:
                System.out.println("Incorrect input");
                suggestedActivity();
        }
    }

    private static void evenNumbers() {
        System.out.println("Enter the number to add up to:");
        int number = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of all the even numbers up to " +
                number + " is " + sum);
    }

    private static void primeNumbers() {
        System.out.println("Enter the number to add up to:");
        int highest = new Scanner(System.in).nextInt();
        int total = 0;
        for (int i = 1; i <= highest; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    total = total + i;
                }
            }
        }
        System.out.println("The sum of all the prime numbers up to " +
                highest + " is " + total);
    }

    private static void sumLimit() {
        System.out.println("Enter an upper limit: ");
        int limit = new Scanner(System.in).nextInt();
        int total = 0;
        do {
            System.out.println("Enter number: ");
            int number = new Scanner(System.in).nextInt();
            total = total + number;
        } while (total <= limit);
        System.out.println("Limit of " + limit + " exceeded by " + (total - limit));
    }

    private static void numberSorter() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            System.out.println("[" + i + "] Enter a number: ");
            list.add(new Scanner(System.in).nextInt());
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
