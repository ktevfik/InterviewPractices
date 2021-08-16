/*
 * Copyright (c) 16.08.2021 16:11.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section2;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.StdOut;

public class Exercise14 {
    private final String who;
    private final Date when;
    private final double amount;

    public Exercise14(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public String getWho() {
        return who;
    }

    public Date getWhen() {
        return when;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return getWho() + " spent " + getAmount() + " on " + getWhen();
    }

    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }
        if (x == null) {
            return false;
        }
        if (this.getClass() != x.getClass()) {
            return false;
        }

        Exercise14 that = (Exercise14) x;
        if (!this.getWho().equals(that.getWho())) {
            return false;
        }
        if (!this.getWhen().equals(that.getWhen())) {
            return false;
        }
        if (this.getAmount() != that.getAmount()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Date date = new Date(8, 3, 2016);

        Exercise14 transaction1 = new Exercise14("Rene", date, 500);
        Exercise14 transaction2 = new Exercise14("Rene", date, 500);
        Exercise14 transaction3 = new Exercise14("Argento", date, 600);
        Exercise14 transaction4 = transaction3;

        StdOut.println("Equals 1: " + transaction1.equals(transaction2) + " Expected: true");
        StdOut.println("Equals 2: " + transaction2.equals(transaction1) + " Expected: true");
        StdOut.println("Equals 3: " + transaction1.equals(transaction3) + " Expected: false");
        StdOut.println("Equals 4: " + transaction3.equals(transaction4) + " Expected: true");
    }

}
