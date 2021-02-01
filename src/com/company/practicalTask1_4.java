package com.company;

import java.util.Scanner;

public class practicalTask1_4 {

        public static void main(String[] args) {

        Scanner inputDayNumber = new Scanner(System.in);
        System.out.println("Please enter the day number:");
        int dayNumber = inputDayNumber.nextInt();

        inputDayNumber(dayNumber);
    }

        public static void inputDayNumber(int dayNumber) {

        final int daysInYear = 365;

        if (dayNumber < 0 || dayNumber > 365) {
            System.out.println("Invalid entry, enter day number from 1 to 365");
        } else if (daysInYear - dayNumber >= 334) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: January");
        } else if (daysInYear - dayNumber >= 304) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: February");
        } else if (daysInYear - dayNumber >= 273) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: March");
        } else if (daysInYear - dayNumber >= 243) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: April");
        } else if (daysInYear - dayNumber >= 212) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: May");
        } else if (daysInYear - dayNumber >= 181) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: June");
        } else if (daysInYear - dayNumber >= 151) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: July");
        } else if (daysInYear - dayNumber >= 120) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: August");
        } else if (daysInYear - dayNumber >= 90) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: September");
        } else if (daysInYear - dayNumber >= 59) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: October");
        } else if (daysInYear - dayNumber >= 31) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: November");
        } else if (daysInYear - dayNumber >= 1) {
            System.out.println("The day number is: " + dayNumber + "\nIt is: December");
        }
    }

}
