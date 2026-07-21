package com.dsa.basics;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = scan.nextInt();
        System.out.println("Enter the second Number:");
        int b= scan.nextInt();

        System.out.println("Sum of two numbers is:"+(a+b));
    }
}
