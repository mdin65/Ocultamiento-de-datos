package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {
    private int day;
    private int month;
    private int year;
    private String time;

    public TodaysDate() {
        Calendar now = new GregorianCalendar();
        this.day = now.get(Calendar.DAY_OF_MONTH);
        this.month = now.get(Calendar.MONTH) + 1; // Calendar.MONTH es base 0
        this.year = now.get(Calendar.YEAR);
        this.time = String.format("%02d:%02d:%02d",
                now.get(Calendar.HOUR_OF_DAY),
                now.get(Calendar.MINUTE),
                now.get(Calendar.SECOND));
    }

    public void printDateAndTime() {
        System.out.println("Time: " + time);
        System.out.println("Date: " + day + " " + month + " " + year);
    }

    // Getters
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }
    public String getTime() { return time; }
}
