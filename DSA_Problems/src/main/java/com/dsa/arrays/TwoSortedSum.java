package com.dsa.arrays;

import java.util.Arrays;

public class TwoSortedSum {
    public static boolean findSortedSum(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int currentSum=arr[left]+arr[right];
            if(currentSum==target){
                return true;
            }
            else if(currentSum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 8, 10, 15};
        System.out.println("Given Sorted Array:"+ Arrays.toString(numbers));
        int target = 14;
        System.out.println("Target Element of two pair sum:"+target);
        System.out.println("Find out the two pair sum acc to target value:"+findSortedSum(numbers, target));
    }
}
