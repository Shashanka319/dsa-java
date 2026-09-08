package com.dsa.basics;

import java.util.Scanner;

public class TrailingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trailingZero(n));
    }
    static int trailingZero(int n){
        int res =0;
        int powerOfFive=5;
        while(n>=powerOfFive){
            res = res+(n/powerOfFive);
            powerOfFive*=5;
        }
        return res;
    }
}
