package com.telran.org.homeworks;

import java.util.Scanner;

public class HomeworkFiveThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int numbF = scanner.nextInt();
        System.out.println("Enter second number");
        int numbS = scanner.nextInt();
        System.out.println("Enter third number");
        int numbT = scanner.nextInt();
        int max = findMax(numbF, numbS, numbT);
        System.out.println("The bigger number is " + max);
    }

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
