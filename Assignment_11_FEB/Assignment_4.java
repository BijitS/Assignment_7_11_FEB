package com.company.Assignment_11_FEB;
import java.util.Arrays;
public class Assignment_4 {
    public static void main(String[] args) {

        //WAP to check permutation

        int [] array = {1,2,3,4,5,6};
        int [] array2 = {2,1,3,6,5,4};

        //sorting
        for (int i = 0; i < array2.length; i++)
        {
            for (int j = i + 1; j < array2.length; j++)
            {
                int temp = 0;
                if (array2[i] > array2[j])
                {
                    temp = array2[i];
                    array2[i] = array2[j];
                    array2[j] = temp;
                }
            }
        }
        System.out.println(Arrays.equals(array,array2));
    }
}
