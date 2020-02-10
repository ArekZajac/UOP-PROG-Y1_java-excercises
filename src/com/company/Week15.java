package com.company;

import java.util.Scanner;

public class Week15 {
    public static void main(String[] args) {
        excerciseTwo();
    }

    private static void excerciseOne() {
        int[] intArr = {11, 82, 88, 23, 33, 20, 78, 80, 24, 100, 47, 41, 73, 59, 32, 67, 89, 26, 65, 5, 28, 37, 42, 22,
                79, 80, 16, 7, 66, 69, 64, 68, 94, 14, 57, 50, 77, 13, 49, 10, 56, 32, 53, 95, 62, 63, 25, 1, 17, 70,
                96, 4, 58, 32, 60, 39, 97, 2, 54, 61, 83, 86, 74, 52, 29, 43, 30, 35, 92, 99, 40, 45, 12, 44, 51, 9, 3,
                27, 91, 98, 8, 15, 46, 80, 93, 81, 36, 90, 6, 34, 76, 32, 21, 38, 72, 87, 18, 19, 84, 75};
        System.out.println("Modifier (\"\", \"greater\", \"sum\", \"frequent\"): ");
        String modifier = new Scanner(System.in).nextLine();
        arrayPrinter(intArr, modifier.toLowerCase());
    }

    private static void excerciseTwo() {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Add a number: ");
        int num = new Scanner(System.in).nextInt();
    }

    private static void arrayPrinter(int[] array, String modifier) {
        int sum = 0;
        int count = 1, tempCount;
        int popular = array[0];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            switch (modifier) {
                case "":
                    System.out.println("[" + i + "] " + array[i]);
                    break;
                case "greater":
                    if (array[i] > 50) {
                        System.out.println("[" + i + "] " + array[i]);
                    }
                    break;
                case "sum":
                    sum = sum + array[i];
                    if (i == array.length - 1) {
                        System.out.println("Sum: " + sum);
                    }
                    break;
                case "average":
                    sum = sum + array[i];
                    if (i == array.length - 1) {
                        System.out.println("Average: " + sum / array.length);
                    }
                    break;
                case "frequent":
                    for (int j = 0; j < (array.length - 1); j++) {
                        temp = array[i];
                        tempCount = 0;
                        for (int k = 1; k < array.length; k++) {
                            if (temp == array[k])
                                tempCount++;
                        }
                        if (tempCount > count) {
                            popular = temp;
                            count = tempCount;
                        }
                    }
                    if (i == array.length - 1) {
                        System.out.println("Most Frequent: " + popular);
                    }
                    break;
            }
        }
    }
}
