package com.company;

import java.util.Random;

public class EvenOrOddTest {

    public static void main(String[] args) {
        int[] numberArray = new int[10];
        Random rand = new Random();

        System.out.printf("Number\tEven or Odd%n");

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = rand.nextInt(31);
            System.out.printf("%d\t\t\t%s%n", numberArray[i], isEven(numberArray[i])? "Even":"Odd");
        }
    }

    private static boolean isEven(int number) {
        int evenOdd = number % 2;
        return evenOdd == 0;
    }
}
