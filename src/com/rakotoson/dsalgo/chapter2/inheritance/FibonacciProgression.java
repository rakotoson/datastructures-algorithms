package com.rakotoson.dsalgo.chapter2.inheritance;

/**
 * Class for the Fibonacci progression
 *
 * @author Avotra Rakotoson
 *
 */
public class FibonacciProgression extends Progression {
    protected long prev;

    public FibonacciProgression() {
        this(0, 1);
    }

    public FibonacciProgression(long first, long second) {
        super(first);

        prev = second - first;
    }

    @Override
    protected void advance() {
        long temp = prev;
        prev = current;
        current += temp;
    }
}
