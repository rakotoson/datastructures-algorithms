package com.rakotoson.dsalgo.chapter1.exercices.reinforcement;

/**
 * Write a short Java method that counts the number of vowels in a given character string.
 *
 * @author Avotra Rakotoson
 *
 */

public class R8 {
    public static void main(String[] args) {
        System.out.println(countVowels("Avotra Niaina Rakotoson"));
    }

    public static int countVowels(String s) {
        int vowels = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'o' || ch == 'i' || ch == 'e' || ch == 'u') {
                vowels++;
            }
        }

        return vowels;
    }
}
