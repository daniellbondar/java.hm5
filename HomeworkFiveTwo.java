package com.telran.org.homeworks;

import java.util.Scanner;

public class HomeworkFiveTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = scanner.nextInt();
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            System.out.println(year + " is leap");
        } else {
            System.out.println(year + " is not leap");
        }

    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
