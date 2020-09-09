package com.rakotoson.dsalgo.chapter2.abstracts;

public abstract class AbstractProgression {
    protected long current;

    public AbstractProgression() {
        this(0);
    }

    public AbstractProgression(long start) {
        current = start;
    }

    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    public void printProgression(int n) {
        System.out.print(nextValue() + "\t");
        for (int i = 0; i < n; i++) {
            System.out.print(nextValue() + "\t");
        }

        System.out.println();
    }

    protected abstract void advance();
}
