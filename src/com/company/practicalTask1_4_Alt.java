package com.company;

import java.util.Scanner;

public class practicalTask1_4_Alt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Month number: ");
        int monthNumber = input.nextInt();
        if(monthNumber<1 || monthNumber>12) {
            System.out.println("Invalid Month number. Please enter value 1 to 12: ");
        } else
                System.out.println("Please enter a Year: ");
                int year = input.nextInt();

        if(year < 0) {
            System.out.println("Invalid year. Please enter value >= 0: ");

        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 \n" + year); break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 \n" + year); break;
            case 2:
                boolean isLeapYear;
                isLeapYear = (year % 400 == 0) || (year % 100 == 0) && (year % 4 == 0);

                if (isLeapYear) {
                    System.out.println("29 \n" + year);
                } else
                    System.out.println("28 \n" + year);
            }
        }
    }
}