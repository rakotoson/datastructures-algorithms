package com.rakotoson.dsalgo.chapter1.exercices.creativity;

import java.util.Random;

/**
 * Write a Java method that takes an array containing the set of all integers in
 * the range 1 to 52 and shuffles it into random order. Your method should
 * output each possible order with equal probability.
 *
 * @author Avotra Rakotoson
 *
 */

public class C8 {
    public static void main(String[] args) {
        int[] results = shuffleArray(1, 52);

        for (int result: results) {
            System.out.print(result + " ");
        }
    }

    private static int[] shuffleArray(int a, int b) {
        Random random = new Random();
        int size = b - a + 1;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = a + i;
        }

        for (int i = 0; i < array.length; i++) {
            int randomPosition = random.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
    }
}
