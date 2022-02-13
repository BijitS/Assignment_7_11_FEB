package com.company.Assignment_11_FEB;

import java.util.Arrays;

public class Assignment_2 {
    public static void main(String[] args) {

        //WAP to check the array is unique or not

        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int count = 0, temp = 1;

        int common = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > temp) {
                temp = count;
            }
            count = 0;
        }

        if(temp>1)
        {
            System.out.println("The array is not unique");
        }
        else
        {
            System.out.println("The array is unique");
        }
    }
}


