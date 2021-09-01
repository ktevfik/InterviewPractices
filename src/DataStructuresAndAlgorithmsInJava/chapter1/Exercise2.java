/*
 * Copyright (c) 1.09.2021 18:03.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter1;

import java.util.Arrays;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {

        GameEntry[] A = new GameEntry[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry(new Random().nextInt(500) + 1);
        }
        GameEntry[] B = A.clone();
        System.out.println("A contents below");
        printScores(A);
        System.out.println("\n++++++++++++++++++++++++++");
        System.out.println("B contents below");
        printScores(B);
        System.out.println("set A[4] to 550");
        A[4].setScore(550);
        System.out.println("print B[4]");
        System.out.println(B[4].getScore());
        System.out.println(Arrays.equals(A, B)); // false
        System.out.println(Arrays.equals(A, B)); // true
        System.out.println(A[4].equals(B[4])); // true
    }

    private static void printScores(GameEntry[] a) {
        for (GameEntry gameEntry : a) {
            System.out.print(gameEntry.getScore() + " ");
        }
        System.out.println();
    }
}

class GameEntry {
    private Integer score;

    GameEntry(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
