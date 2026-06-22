package com.dsa.arrays;

public class LowestElement {
    public static int lowestElement(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] numbers={56,93,2,3,85,929};
        System.out.println("Lowest Element in Given Array:"+lowestElement(numbers));
    }
}
