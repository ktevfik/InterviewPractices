/*
 * Copyright (c) 1.09.2021 22:13.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter2;

public class Progression {

    protected long current;

    public Progression() {
        this(0);
    }

    public Progression(long start) {
        this.current = start;
    }

    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    protected void advance() {
        current++;
    }

    public void printProgression(int n) {
        System.out.print(nextValue());
        for (int j = 1; j < n; j++) {
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }
}
