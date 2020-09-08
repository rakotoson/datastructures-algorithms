package com.rakotoson.dsalgo.chapter1.exercices.reinforcement;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a short java method, inputAllBaseTypes, that inputs a different value
 * of each base type from the standard input device and prints it back to the
 * standard output device.
 *
 * @author Avotra Rakotoson
 *
 */

public class R1 {
    /**
     *
     * @param args arguments for main method
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        inputAllBaseType(number);
    }

    /**
     *
     * @param obj a object we need to print
     */
    private static void inputAllBaseType(Object obj) {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("Number: " + obj);
        printWriter.close();
    }
}
