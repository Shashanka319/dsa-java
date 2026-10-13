package com.corejavaproject.arrays;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();
       int b = input.nextInt();
       int c = input.nextInt();

       int sum1=a+b;
       int sum2=a+c;
       int sum3=b+c;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

}
