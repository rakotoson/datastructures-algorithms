package com.rakotoson.dsalgo.chapter2.abstracts;

public class ArithmeticProgression extends AbstractProgression {
    protected long increment;

    public ArithmeticProgression() {
        this(1, 0);
    }

    public ArithmeticProgression(long stepSize) {
        this(stepSize, 0);
    }

    public ArithmeticProgression(long stepSize, long start) {
        super(start);

        increment = stepSize;
    }

    @Override
    protected void advance() {
        current += increment;
    }
}
