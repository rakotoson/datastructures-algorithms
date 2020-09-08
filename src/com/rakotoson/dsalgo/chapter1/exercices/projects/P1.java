package com.rakotoson.dsalgo.chapter1.exercices.projects;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a short Java program that takes all the lines input to standard input and
 * writes them to standard output in reverse order. That is, each line is output in the
 * correct order, but the ordering of the lines is reversed.
 *
 * @author Avotra Rakotoson
 */

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lines: ");

        String[] input = new String[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextLine();
        }

        for (int i = input.length-1; i >= 0 ; i--) {
            System.out.println(input[i]);
        }
    }
}
