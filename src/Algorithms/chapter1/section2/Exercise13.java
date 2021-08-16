/*
 * Copyright (c) 16.08.2021 16:09.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section2;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {
    private final String who;
    private final Date when;
    private final double amount;

    public Exercise13(String who, Date when, double amount) {
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

    public static void main(String[] args) {
        Date date = new Date(8, 3, 2016);

        Exercise13 transaction = new Exercise13("Rene", date, 500);
        StdOut.println(transaction);
        StdOut.println("Expected: Rene spent 500.0 on 8/3/2016");
    }
}
