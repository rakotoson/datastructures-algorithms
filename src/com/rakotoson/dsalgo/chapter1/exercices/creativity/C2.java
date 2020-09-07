package com.rakotoson.dsalgo.chapter1.exercices.creativity;

/**
 * Write a pseudocode description of a method for finding the smallest and largest
 * numbers in an array of integers and compare that to a Java method that would do
 * the same thing.
 *
 * @author Avotra Rakotoson
 *
 */
public class C2 {
    public static void main(String[] args) {
        int[] a = {30, 11, 12, 13, 14, 20, 15, 17};
        int min = a[0];
        int max = a[1];

        int i = a.length - 1;
        while (i >= 0) {
            if(a[i] < min) min = a[i];
            if(a[i] > max) max = a[i];
            i--;
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
