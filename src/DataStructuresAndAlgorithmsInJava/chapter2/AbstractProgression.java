/*
 * Copyright (c) 1.09.2021 22:10.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter2;

public abstract class AbstractProgression {
    protected long current;

    public AbstractProgression() {
        this(0);
    }

    public AbstractProgression(long start) {
        this.current = start;
    }

    public long nextValue() {
        long answer = this.current;
        advance();
        return answer;
    }

    public void printProgression(int n) {
        System.out.println(nextValue());
        for (int j = 1; j < n; j++) {
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }

    protected abstract void advance();
}
