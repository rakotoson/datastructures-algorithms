package com.rakotoson.dsalgo.chapter1.exercices.reinforcement;

/**
 * Write a short Java method that takes an integer n and returns the sum of the
 * squares of all positive integers less than or equal to n.
 *
 * @author Avotra Rakotoson
 *
 */

public class R7 {
    public static void main(String[] args) {
        System.out.println(sumSquares(4));
    }

    public static int sumSquares(int n) {
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            sum += (i*i);
        }

        return sum;
    }
}
