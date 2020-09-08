package com.rakotoson.dsalgo.chapter1.exercices.projects;

/**
 * A common punishment for school children is to write out a sentence multiple
 * times. Write a Java stand-alone program that will write out the following
 * sentence one hundred times: “I will never spam my friends again.” Your program
 * should number each of the sentences and it should make eight different random-
 * looking typos.
 *
 * @author Avotra Rakotoson
 *
 */
public class P3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": " + "I will never spam my friends again.");
        }
    }
}
