package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.System.out;

public class TodaysDate {
    //member variables
    String time;
    public int day;
    private int month;
    protected int year;

    //methods
    public void printDateAndTime(){
        GregorianCalendar calendar = new GregorianCalendar();
        time = calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND);
        day = calendar.get(Calendar.DATE);
        month = calendar.get(Calendar.MONTH) + 1;
        year = calendar.get(Calendar.YEAR);

        out.println("Time: " + time);
        out.println("Date: " + month + " " + day + " " + year);
    }

}
