package com.rakotoson.dsalgo.chapter2;

import com.rakotoson.dsalgo.chapter2.abstracts.ArithmeticProgression;

public class TestAbstractProgression {
    public static void main(String[] args) {
        ArithmeticProgression progression;

        // Test Arithmetic progression
        System.out.print("Arithmetic progression with default increment: ");
        progression = new ArithmeticProgression();
        progression.printProgression(10);
        System.out.print("Arithmetic progression with increment 5: ");
        progression = new ArithmeticProgression(5);
        progression.printProgression(10);
        System.out.println();
    }
}
