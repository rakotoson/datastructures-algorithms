package com.rakotoson.dsalgo.chapter1.exercices.creativity;

/**
 * Write a short Java method that takes an array of int values and determines if there
 * is a pair of distinct elements of the array whose product is even.
 *
 * @author Avotra Rakotoson
 *
 */

public class C4 {
    public static void main(String[] args) {
        int[] n = { 1, 5, 4, 5 };
        findEvenProduct(n);
    }

    private static void findEvenProduct(int[] n) {
        for (int i = 0; i < n.length; i++) {
            if(n[i] % 2 == 0) {
                System.out.println("Pair found at index: " + i + " Element: " + n[i]);
                break;
            }
        }
    }
}
