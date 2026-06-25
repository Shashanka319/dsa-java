package com.dsa.arrays.staticArray;


import java.util.Arrays;

public class MyArray {
    public static void main(String[] args){
        int[] myArray=new int[10];
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=3;
        myArray[3]=4;
        myArray[4]=5;
        myArray[5]=6;
        myArray[6]=7;
        myArray[7]=8;
        myArray[8]=9;
        myArray[9]=10;
        System.out.println("Total Array elements:"+Arrays.toString(myArray));

        System.out.println("Array Element at index 0:"+myArray[0]);
        System.out.println("Array Element at index 1:"+myArray[1]);
        System.out.println("Array Element at index 2:"+myArray[2]);
        System.out.println("Array Element at index 3:"+myArray[3]);
        System.out.println("Array Element at index 4:"+myArray[4]);
        System.out.println("Array Element at index 5:"+myArray[5]);
        System.out.println("Array Element at index 6:"+myArray[6]);
        System.out.println("Array Element at index 7:"+myArray[7]);
        System.out.println("Array Element at index 8:"+myArray[8]);
        System.out.println("Array Element at index 9:"+myArray[9]);

        int target=5;
        System.out.println("Array value:"+target);
        int index=findIndex(myArray,target);
        System.out.println("The index of "+target+"is:"+index);


    }
    public static int findIndex(int[] arr, int target) {
        // Loop through each index of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Value found, return current index
            }
        }
        return -1; // Value not found in the array
    }
}
