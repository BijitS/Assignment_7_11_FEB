package com.company.Assignment_10_FEB;
import java.util.Arrays;
public class Assignment_2 {
    public static void main(String[] args) {

        //Given a random set of numbers, Print them in sorted order.

        int[] arr = {4, 7, 1, 5, 78, 1, 6, 89, 6, 3};


        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int temp = 0;
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
