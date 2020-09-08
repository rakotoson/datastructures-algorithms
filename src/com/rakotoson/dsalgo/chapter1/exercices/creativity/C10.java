package com.rakotoson.dsalgo.chapter1.exercices.creativity;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a short Java program that takes two arrays a and b of length n storing int
 * values, and returns the dot product of a and b. That is, it returns an array c of
 * length n such that c[i] = a[i] · b[i], for i = 0, . . . , n − 1.
 *
 * @author Avotra Rakotoson
 *
 */
public class C10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length of array: ");
        int size = scanner.nextInt();

        int[] a = new int[size];
        int[] b = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter a value of a: ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print("Enter a value of b: ");
            b[i] = scanner.nextInt();
        }

        int[] c = new int[size];
        for (int i = 0; i < size; i++) {
            c[i] = a[i] * b[i];
        }


        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println("c: " + Arrays.toString(c));
    }
}
