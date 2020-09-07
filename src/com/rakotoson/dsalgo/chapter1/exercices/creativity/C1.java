package com.rakotoson.dsalgo.chapter1.exercices.creativity;

/**
 * Write a pseudocode description of a method that reverses an array of n integers,
 * so that the numbers are listed in the opposite order than they were before, and
 * compare this method to an equivalent Java method for doing the same thing.
 *
 * @author Avotra Rakotoson
 *
 */

public class C1 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 5, 3, 4 };
        int start = 0;
        int end = numbers.length - 1;

        reverseArray(numbers, start, end);
    }

    /**
     *
     * @param numbers an array of integer we need to reverse
     * @param start first element in the array
     * @param end last element in the array
     */
    private static void reverseArray(int[] numbers, int start, int end) {
        int temp;
        while (start < end) {
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
