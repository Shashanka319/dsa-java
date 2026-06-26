package com.dsa.arrays.staticArray;

import java.util.Arrays;

public class Rotate {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;


        reverseHelper(nums, 0, n - 1);

        /
        reverseHelper(nums, 0, k - 1);


        reverseHelper(nums, k, n - 1);
    }


    private static void reverseHelper(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);
        System.out.println("Array Elements:"+ Arrays.toString(arr));
        System.out.println("K value of Given Rattating COndition:"+k);

        for (int num : arr) {
            System.out.print("Rotated Array Elements:"+num + " "); 
        }
    }
}
