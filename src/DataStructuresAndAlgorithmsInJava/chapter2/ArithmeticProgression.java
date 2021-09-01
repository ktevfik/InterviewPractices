/*
 * Copyright (c) 1.09.2021 22:13.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter2;

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
        this.increment = stepSize;
    }

    @Override
    protected void advance() {
        current += increment;
    }
}
