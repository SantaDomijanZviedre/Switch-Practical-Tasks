package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        practicalTaskNo1();
        practicalTaskNo2(15);
        // practicalTaskNo3(day, month, year, formatChoice);
        practicalTaskNo4();
        practicalTaskNo4_Alternative();
        practicalTaskNo5();
    }

    static void practicalTaskNo1() {
        short a = -21;
        short b = 130;

        // smallest, largest
        System.out.println("The largest variable is: " + Math.max(a, b));
        System.out.println("The smallest variable is: " + Math.min(a, b));

        // equal or not
        System.out.println(a == b ? "Variables are equal" : "Variables are not equal");

        // any odd
        System.out.println((a % 2 != 0) || (b % 2 != 0) ? "There are some odd variables." :
                "There are no odd variables.");

        // any even
        if ((a % 2 == 0) && (b % 2 == 0)) {
            System.out.println("Both variables are even.");
        } else if ((a % 2 == 0) || (b % 2 == 0)) {
            System.out.println("There are some even variables.");
        } else {
            System.out.println("There are no even variables.");
        }

        // any negative
        System.out.println("First number is " + (a < 0 ? "negative." : "not negative."));
        System.out.println("Second number is " + (b < 0 ? "negative." : "not negative."));

        // any positive
        System.out.println("a = " + (a > 0 ? "positive" : "not positive"));
        System.out.println("b = " + (b > 0 ? "positive" : "not positive"));

        // any less than 100
        System.out.println((a < 100) || (b < 100) ? "There are some variables less than 100." :
                "There are no variables less than 100.");

    }

    static void practicalTaskNo2(long time) {

        if (time < 0 || time > 24) {
            System.out.println("Please enter valid time!");
        } else if (time > 6 && time < 12) {
            System.out.println("Good Morning Sunshine!");
        } else if ((time > 13) && (time < 19)) {
            System.out.println("Good Afternoon, Work Hard!");
        } else if ((time > 20) && (time < 24)) {
            System.out.println("Good evening. Get some rest.");
        }
    }

    /*static void practicalTaskNo3(int day, int month, int year, int formatChoice) {
        // here I got stuck while trying to improve code, but this one works

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day");
        int day = input.nextInt();
        System.out.println("Please enter the month");
        int month = input.nextInt();
        System.out.println("Please enter the year");
        int year = input.nextInt();
        System.out.println("Please select the date formatting: \n" +
                "\t enter 1 for YYYY/MM/DD \n" +
                "\t enter 2 for YYYY.MM.DD");
        int formatChoice = input.nextInt();

        String Date = input.nextLine();
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

            if (formatChoice == 1) {
                System.out.println("Your date is: " + year + "/" + month + "/" + day);
            } else if (formatChoice == 2) {
                System.out.println("Date is: " + year + "." + month + "." + day);
            } else {
                System.out.println("Invalid choice, please try again.");
            }
    }*/

        static void practicalTaskNo4() {
        /* I tried to make some method here to replace all that text below,
           but I better push to git what I have even if it is not perfect
           I saw your links about calendar but at this point it is still too much :D */

            Scanner inputDayNumber = new Scanner(System.in);
            System.out.println("Please enter the day number:");

            int dayNumber = inputDayNumber.nextInt();
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
            } else if (daysInYear - dayNumber >= 0) {
                System.out.println("The day number is: " + dayNumber + "\nIt is: December");
            }   // I am sure this can be written 10X shorter with some smart function from links that you sent :),
            // but for now this works :)
        }


        static void practicalTaskNo4_Alternative() {

       /* First I need to study more Methods and then I can continue with this.

       Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month");
        int month = input.nextInt();
        System.out.println("Please enter the year");
        int year = input.nextInt();

        String numberOfDaysInMonth = input.nextLine();
        if(daysInYear - sumDays <= 0) {

        }*/
        }

        static void practicalTaskNo5() {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter how many hours did you work today:");
            int workingHoursInDay = input.nextInt();

            String salary = input.nextLine();
            if (workingHoursInDay < 0 || workingHoursInDay > 24) {
                System.out.println("Invalid entry, please enter value from 0 to 24!");
            } else if (workingHoursInDay <= 8) {
                System.out.println("Your salary today is " + workingHoursInDay * 10 + " Eur.");
            } else if (workingHoursInDay > 8) {
                System.out.println("Your salary today is " + (80 + (workingHoursInDay - 8) * 15) + " Eur.");
            }
        }
// PLEASE I WOULD VERY MUCH LIKE COMMENTS HOW BEST TO IMPROVE THIS :)
    }