package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class practicalTask1_1_2_5 {

    public static void main(String[] args) {
        practicalTaskNo1(32, -368);
        practicalTaskNo2(6);
        // practicalTaskNo3(day, month, year, formatChoice); - moved to separate Java Class
        //practicalTaskNo4(); - moved to separate Java Class
        //practicalTaskNo4_Alternative(); - moved to separate Java Class
        practicalTaskNo5();
    }

    static void practicalTaskNo1(int a, int b) {
        //short a = 32;
        //short b = -368;

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
    }