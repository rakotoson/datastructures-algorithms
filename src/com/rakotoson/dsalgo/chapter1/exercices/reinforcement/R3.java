package com.rakotoson.dsalgo.chapter1.exercices.reinforcement;

/**
 * Write a short Java method, isMultiple, that takes two long values, n and m, and
 * returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
 *
 * @author Avotra Rakotoson
 *
 */

public class R3 {
    public static void main(String[] args) {
        System.out.println(isMultiple(100L, 50L));
    }

    public static boolean isMultiple(long n, long m) {
        if(m > n) {
            return isMultiple(m, n);
        }

        return n % m == 0;
    }
}
