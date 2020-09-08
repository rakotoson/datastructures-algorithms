package com.rakotoson.dsalgo.chapter1.exercices.creativity;

import java.util.Scanner;

/**
 * Write a Java program that can take a positive integer greater than 2 as input and
 * write out the number of times one must repeatedly divide this number by 2 before
 * getting a value less than 2.
 *
 * @author Avotra Rakotoson
 *
 */

public class C6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than 2: ");
        int n = scanner.nextInt();

        System.out.println("The number of times one must repeatedly divide this number by 2 is: " + countNumberOfDivisible(n));
    }

    private static int countNumberOfDivisible(int n) {
        int count = 0;

        while (n > 2) {
            n -= 2;
            count++;
        }

        return count;
    }
}
