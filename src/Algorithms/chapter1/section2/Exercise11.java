/*
 * Copyright (c) 16.08.2021 15:10.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section2;

public class Exercise11 {
    private final int month;
    private final int day;
    private final int year;

    public Exercise11(int month, int day, int year) {
        if (!isDateValid(month, day, year)) {
            throw new RuntimeException("Invalid date!");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    private boolean isDateValid(int month, int day, int year) {

        boolean valid = true;

        int[] maxNumberOfDaysPerMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year < 1 || month < 1 || month > 12 || day < 1 || day > maxNumberOfDaysPerMonth[month - 1]) {
            valid = false;
        }

        return valid;
    }

    public static void main(String[] args) {
        Exercise11 smartDate1 = new Exercise11(4, 18, 1989);
        Exercise11 invalidDate = new Exercise11(2, 30, 2016);
    }
}
