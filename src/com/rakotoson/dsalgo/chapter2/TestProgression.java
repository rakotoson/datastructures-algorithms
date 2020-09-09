package com.rakotoson.dsalgo.chapter2;

import com.rakotoson.dsalgo.chapter2.inheritances.ArithmeticProgression;
import com.rakotoson.dsalgo.chapter2.inheritances.FibonacciProgression;
import com.rakotoson.dsalgo.chapter2.inheritances.GeometricProgression;
import com.rakotoson.dsalgo.chapter2.inheritances.Progression;

public class TestProgression {
    public static void main(String[] args) {
        Progression progression;

        // Test Arithmetic progression
        System.out.print("Arithmetic progression with default increment: ");
        progression = new ArithmeticProgression();
        progression.printProgression(10);
        System.out.print("Arithmetic progression with increment 5: ");
        progression = new ArithmeticProgression(5);
        progression.printProgression(10);
        System.out.print("Arithmetic progression with start 2: ");
        progression = new ArithmeticProgression(5, 2);
        progression.printProgression(10);
        System.out.println();

        // Test Geometric progression
        System.out.print("Geometric progression with default increment: ");
        progression = new GeometricProgression();
        progression.printProgression(10);
        System.out.print("Geometric progression with base 3: ");
        progression = new GeometricProgression(3);
        progression.printProgression(10);
        System.out.print("Geometric progression with start 4: ");
        progression = new GeometricProgression(3, 4);
        progression.printProgression(10);
        System.out.println();

        // Test Fibonacci progression
        System.out.print("Fibonacci progression with default start value: ");
        progression = new FibonacciProgression();
        progression.printProgression(10);
        System.out.print("Fibonacci progression with start value 4 and 6: ");
        progression = new FibonacciProgression(4, 6);
        progression.printProgression(10);
    }
}
