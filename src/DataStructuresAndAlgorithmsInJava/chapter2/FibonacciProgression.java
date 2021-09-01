/*
 * Copyright (c) 1.09.2021 22:16.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter2;

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
