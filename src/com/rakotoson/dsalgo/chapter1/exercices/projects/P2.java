package com.rakotoson.dsalgo.chapter1.exercices.projects;

import java.util.Scanner;

/**
 * Write a Java program that can simulate a simple calculator, using the Java console
 * as the exclusive input and output device. That is, each input to the calculator, be
 * it a number, like 12.34 or 1034, or an operator, like + or =, can be done on a
 * separate line. After each such input, you should output to the Java console what
 * would be displayed on your calculator.
 *
 * @author Avotra Rakotoson
 *
 */

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers ");

        System.out.print("\tFirst: ");
        double first = scanner.nextDouble();
        System.out.print("\tSecond: ");
        double second = scanner.nextDouble();

        System.out.print("\tEnter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.println("Error: operator is incorrect.");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}
