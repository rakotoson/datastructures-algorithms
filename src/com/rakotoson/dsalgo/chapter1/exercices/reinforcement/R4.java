package com.rakotoson.dsalgo.chapter1.exercices.reinforcement;

/**
 * Write a short Java method, isEven, that takes an int i and returns true if and only
 * if i is even. Your method cannot use the multiplication, modulus, or division operators,
 * however.
 *
 * @author Avotra Rakotoson
 *
 */

public class R4 {
    public static void main(String[] args) {
        System.out.println(isEven(3));
        System.out.println(isEvenNumber(8));
    }

    /**
     *
     * @param n integer to check if isEvent
     * @return true if isEvent
     */
    public static boolean isEven(int n) {
        boolean isEven = true;

        for (int i = 1; i <= n; i++) {
            isEven = !isEven;
        }

        return isEven;
    }

    public static boolean isEvenNumber(int i) {
        while(i > 0) {
            i = i - 2;

            if(i == 0) return true;
        }

        return false;
    }
}
