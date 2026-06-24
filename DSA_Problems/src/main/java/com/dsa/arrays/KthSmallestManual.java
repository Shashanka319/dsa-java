package com.dsa.arrays;
public class KthSmallestManual {


    public static int findKthSmallest(int[] arr, int k) {

        if (k < 1 || k > arr.length) {
            System.out.println("Invalid value of K");
            return -1;
        }

        int n = arr.length;


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


        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;


        System.out.print("Original Array: ");
        printArray(arr);

        int result = findKthSmallest(arr, k);

        if (result != -1) {
            System.out.println("The " + k + "nd smallest element is: " + result);
        }
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