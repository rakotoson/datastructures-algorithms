package com.rakotoson.dsalgo.chapter1.exercices.creativity;

/**
 * Write a Java method that takes an array of float values and determines if all the
 * numbers are different from each other (that is, they are distinct)
 *
 * @author Avotra Rakotoson
 *
 */

public class C7 {
    public static void main(String[] args) {
        float[] numbers = { 2.0f, 3.0f, 1.0f, 4.0f, 5.0f };
        int count = 0;
        try {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] != numbers[i+1]) {
                    count++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index bound exception!");
        }


        if(count == numbers.length-1) {
            System.out.println("All elements are distinct? ");
        }
    }
}
