package com.dsa.basics;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigit(n));
        System.out.println(getFactorial(n));
    }
    static int countDigit(int n){
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    static  int getFactorial(int n){
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
