package com.rakotoson.dsalgo.chapter1.exercices.reinforcement;

/**
 * Write a short Java method that uses a StringBuilder instance to remove all the
 * punctuation from a string s storing a sentence, for example, transforming the
 * string "Let's try, Mike!" to "Lets try Mike".
 *
 * @author Avotra Rakotoson
 *
 */

public class R9 {
    public static void main(String[] args) {
        System.out.println(removeAllPunctuation(new StringBuilder("Let's try, Mike!")));
    }

    public static String removeAllPunctuation(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.charAt(i);

            if(ch == '\'' || ch == '!' || ch == ',') stringBuilder.deleteCharAt(i);
        }

        return stringBuilder.toString();
    }
}
