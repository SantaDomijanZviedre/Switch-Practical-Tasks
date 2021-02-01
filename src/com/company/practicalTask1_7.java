package com.company;

import java.util.Scanner;

public class practicalTask1_7 {

   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("Please enter kmph: ");
       double kilometersPerHour = input.nextDouble();

       long milesPerHour = toMilesPerHour(kilometersPerHour);
       if (milesPerHour < 0)
           System.out.println("Invalid value. Please enter value > 0 ");
       else
           System.out.println("Miles per Hour: " + milesPerHour);
   }

    static long toMilesPerHour(double kilometersPerHour) {

      if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour * 0.6214);
        }
   }
}