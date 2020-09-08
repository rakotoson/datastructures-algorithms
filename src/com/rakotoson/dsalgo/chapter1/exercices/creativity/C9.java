package com.rakotoson.dsalgo.chapter1.exercices.creativity;

/**
 * Write a short Java program that outputs all possible strings formed by using the
 * characters 'c', 'a', 't', 'd', 'o', and 'g' exactly once.
 *
 * @author Avotra Rakotoson
 */
public class C9 {
    public static void main(String[] args) {
        char[] ch = { 'c', 'a', 't', 'd', 'o', 'g' };

        permuteElement(ch, 0, ch.length);
    }

    private static void permuteElement(char[] ch, int startIndex, int endIndex) {
        if(startIndex==endIndex) {
            System.out.println(new String(ch));
        } else {
            for (int i = startIndex; i < endIndex; i++) {
                try {
                    swap(ch, startIndex, i);
                    permuteElement(ch, startIndex + 1, endIndex);
                    swap(ch, startIndex, i);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index not found");
                }
            }
        }
    }

    private static void swap(char[] ch, int i, int x) {
        char temp = ch[i];
        ch[i] = ch[x];
        ch[x] = temp;
    }
}
