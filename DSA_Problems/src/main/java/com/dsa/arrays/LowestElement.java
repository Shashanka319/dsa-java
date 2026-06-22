package com.dsa.arrays;

public class LowestElement {
    pulic static int lowestElement(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.lenght;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
