package com.rakotoson.dsalgo.chapter2.inheritance;

/**
 * Class for arithmetic progressions, which inherits from
 * the general progression class
 *
 * @author Avotra Rakotoson
 *
 */
public class ArithmeticProgression extends Progression {
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
