package com.dsa.arrays;

public class MaxMinArray{
    public static void findMaxMin(int[] numbers){
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }else if (numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("Maximum Number:"+max);
        System.out.println("Minimum Number:"+min);
    }
    public static void main(String[] arr){
        int[] array={5,86,4,96,3,2,42};
        findMaxMin(array);
    }
}