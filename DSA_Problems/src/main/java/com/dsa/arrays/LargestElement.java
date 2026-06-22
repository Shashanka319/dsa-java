package com.dsa.arrays;

public class LargestElement{
    public int largestElement(int[] index){
        int max=index[0];
        for(int i=0;i<index.length-1;i++){
            if(index[i]>max){
                max=index[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[] num={12,45,6,32,78,45};
        LargestElement largestElement = new LargestElement();
       int bigElement= largestElement.largestElement(num);
        System.out.println("Largest Element:"+bigElement);
    }
}