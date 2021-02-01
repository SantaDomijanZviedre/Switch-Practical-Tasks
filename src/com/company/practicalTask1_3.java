package com.company;

import java.util.Scanner;

public class practicalTask1_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day: ");
        int day = input.nextInt();
        System.out.println("Please enter the month: ");
        int month = input.nextInt();
        System.out.println("Please enter the year: ");
        int year = input.nextInt();
        System.out.println("Please select the date formatting: \n" +
                "\t enter 1 for YYYY/MM/DD \n" +
                "\t enter 2 for YYYY.MM.DD");
        int formatChoice = input.nextInt();

        if (formatChoice == 1) {
            System.out.println("Your date is: " + year + "/" + month + "/" + day);
        } else if (formatChoice == 2) {
            System.out.println("Date is: " + year + "." + month + "." + day);
        } else {
            System.out.println("Invalid choice, please try again.");
        }

        dataInput(day, month, year, formatChoice);
    }

    static void dataInput(int day, int month, int year, int formatChoice) {

        if (day < 1 || month < 1 || year < 0) {
            System.out.println("Day and month should be > 0 and year must be positive value!");
        } else if (month == 2 && day > 29) {
            System.out.println("February can not have more than 29 days!");
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            System.out.println("This month does not have more than 30 days!");
        } else if (day > 31) {
            System.out.println("Month can not have more than 31 days! ");
        } else if (month > 12) {
            System.out.println("Year can not have more than 12 months! ");
        }

    }
}
