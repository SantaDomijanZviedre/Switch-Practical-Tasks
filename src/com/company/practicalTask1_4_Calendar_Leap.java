package com.company;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

// Practical Task4 with Calendar and Leap Year
public class practicalTask1_4_Calendar_Leap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year = input.nextInt();
        int maxDays;
        if ((year % 400 == 0) || (year % 100 == 0) && (year % 4 == 0)) {
            maxDays = 366;
        } else maxDays = 365;

        Scanner findMonth = new Scanner(System.in);
        System.out.println("Please enter the day number: ");
        int dayNumber = findMonth.nextInt();

        if (dayNumber < 1 || dayNumber > maxDays) {
            System.out.println("Day number must be 1 to " + maxDays + ". Please enter valid day number: ");
        } else {

            Calendar cal = Calendar.getInstance();
            //cal.set(year, 1, 1);
            cal.set(Calendar.DAY_OF_YEAR, dayNumber);

            System.out.println("The day number is: " + dayNumber);
            System.out.println("It is: " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, Locale.ENGLISH));
        }
    }
}