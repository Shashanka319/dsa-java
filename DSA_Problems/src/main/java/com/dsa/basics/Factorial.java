package com.dsa.basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // System.out.println(getFactorial(n));
        System.out.println(getCount(n));
    }
    static int getFactorial(int n)
    {
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    static  int getCount(int n){
        int count =0;
        for(int i=1;i<n;i++){
            n=n/10;
            count++;
        }
        return count;
    }
}
