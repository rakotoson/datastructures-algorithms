package com.rakotoson.dsalgo.chapter1.exercices.creativity;

import java.util.Scanner;

/**
 * Write a short program that takes as input three integers, a, b, and c, from the Java
 * console and determines if they can be used in a correct arithmetic formula (in the
 * given order), like “a + b = c,” “a = b − c,” or “a ∗ b = c.”
 *
 * @author Avotra Rakotoson
 *
 */

public class C3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        scanner.nextInt();
        int a;

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        a = b - c;
        if(determine(a, b, c)) System.out.println("Can be used in arithmetic formula.");
        else System.out.println("Can't be used in arithmetic formula.");
    }

    private static boolean determine(int a, int b, int c) {
        if(a + b == c) return true;
        else if (b + c == a) return true;
        else if (a + c == b) return true;
        else if (a * b == c) return true;
        else if (b * c == a) return true;
        else return a * c == b;
    }
}
