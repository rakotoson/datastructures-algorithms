package com.rakotoson.dsalgo.chapter1.exercices.reinforcement;

/**
 * Write a short Java method that takes an integer n and returns the sum of all the
 * odd positive integers less than or equal to n.
 *
 * @author Avotra Rakotoson
 *
 */

public class R6 {
    public static void main(String[] args) {
        System.out.println(sumOfOddNumbers(5));
    }

    public static int sumOfOddNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++ ) {
            if(i % 2 != 0) sum += i;
        }

        return sum;
    }
}
