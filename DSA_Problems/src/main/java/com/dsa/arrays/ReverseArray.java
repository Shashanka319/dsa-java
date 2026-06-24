package com.dsa.arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Original Array: ");
        printArray(arr);
        reverse(arr);
        System.out.print("Reversed Array: ");
        printArray(arr);
    }


    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}