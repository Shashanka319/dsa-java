package com.corejavaproject.arrays;

public class Array {
    public  void getApproch1OfOne() {
        System.out.println("Execute the one dimential array using one Approch");
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println();
    }
    public  void getApproch2OfOne() {
        System.out.println("Execute the one dimential array using Another Approch ");
        int[] array = {10, 20, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println();
    }

    public  void getMutliApproch1() {
        System.out.println("Execute the multidimensional array using one  Approach");

        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 1;
        array[1][1] = 2;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
    }
    public  void getMutliApproch2() {
        System.out.println("Execute the multidimensional array using one  Approach");

        int[][] array = {
                {1, 2},
                {1, 2}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
