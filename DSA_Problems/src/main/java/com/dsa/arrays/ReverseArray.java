package com.dsa.arrays;

public class ReverseArray {

    // Function to reverse the array in place
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Loop runs until pointers meet in the middle
        while (start < end) {
            // Swap elements using a temporary variable
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers closer to each other
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Original Array: ");
        printArray(arr);

        // Reverse the array
        reverse(arr);

        System.out.print("Reversed Array: ");
        printArray(arr);
    }

    // Helper method to print the array manually
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