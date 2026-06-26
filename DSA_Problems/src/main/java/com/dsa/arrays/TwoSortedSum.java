package com.dsa.arrays;

import java.util.Arrays;

public class TwoSortedSum {
    public static boolean findSum(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temSum=arr[left]+arr[right];
            if(temSum==target){
                return true;
            }else if(temSum<target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
    public static boolean findTotalSum(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temSum=arr[left]+arr[right];
            if(temSum==target){
                return true;
            }else if(temSum<target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] arr){
        int[] num={1,2,3,4,5,6,7,8,9,10};
        int target=9;
        System.out.println("Sorted Array Elements:"+Arrays.toString(num));
        System.out.println("Target sum Value:"+target);
        System.out.println("Find out the two pair sum in sorted array:"+findSum(num,target));
        int[] num1={1,2,3,4,5,6,7,8,9,10};
        int target1=9;
        System.out.println("Total Sum Value:"+findTotalSum(num1,target1));
    }
}

