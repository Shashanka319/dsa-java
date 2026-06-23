package com.dsa.arrays;

import java.util.Arrays;

public class ReverseElement {
    public static void reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        int[] numbers={3,4,6,8,1,34,75,12,2,0};
        System.out.println("Normal Array:"+Arrays.toString(numbers));
        ReverseElement.reverse(numbers);
        System.out.println("Reversed Array:"+Arrays.toString(numbers));
    }
}
