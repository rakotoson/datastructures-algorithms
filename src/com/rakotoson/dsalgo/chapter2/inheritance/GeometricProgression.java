package com.rakotoson.dsalgo.chapter2.inheritance;

/**
 * Class for geometric progressions, which inherits from
 * the general progression class
 *
 * @author Avotra Rakotoson
 *
 */
public class GeometricProgression extends Progression {
    protected long base;

    public GeometricProgression() {
        this(2, 1);
    }

    public GeometricProgression(long base) {
        this(base, 1);
    }

    public GeometricProgression(long base, long start) {
        super(start);

        this.base = base;
    }

    @Override
    protected void advance() {
        current *= base;
    }
}
