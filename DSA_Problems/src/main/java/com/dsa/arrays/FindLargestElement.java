package com.dsa.arrays;

public class FindLargestElement {
    public static int findLargestElement(int[] arr){
        int max=arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={12,45,2,78,34,6};
        System.out.println("Largest element is "+findLargestElement(arr));
    }
}
