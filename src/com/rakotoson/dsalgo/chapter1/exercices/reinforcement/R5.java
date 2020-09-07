package com.rakotoson.dsalgo.chapter1.exercices.reinforcement;

/**
 * Write a short Java method that takes an integer n and return the sum of all
 * positive integers less than or equal to n.
 *
 * @author Avotra Rakotoson
 *
 */

public class R5 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
