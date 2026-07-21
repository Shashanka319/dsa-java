package com.dsa.basics;

import java.util.Scanner;

public class SumOfPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        System.out.println("Enter the Third number:");
        int c = scan.nextInt();

        System.out.println("Sum of Pairs");
        System.out.println(a+b);
        System.out.println(a+c);
        System.out.println(b+c);

    }
}
