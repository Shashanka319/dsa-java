package com.dsa.arrays;
public class KthSmallestManual {

    // Function to manually sort the array and find the Kth smallest element
    public static int findKthSmallest(int[] arr, int k) {
        // Edge case check
        if (k < 1 || k > arr.length) {
            System.out.println("Invalid value of K");
            return -1;
        }

        int n = arr.length;

        // Manual Bubble Sort implementation
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Return the Kth smallest element (index k - 1)
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;

        // Manually printing the original array
        System.out.print("Original Array: ");
        printArray(arr);

        int result = findKthSmallest(arr, k);

        if (result != -1) {
            System.out.println("The " + k + "nd smallest element is: " + result);
        }
    }

    // Helper method to print the array without using Arrays.toString()
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