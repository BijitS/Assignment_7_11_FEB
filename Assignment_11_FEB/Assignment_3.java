package com.company.Assignment_11_FEB;
import java.util.Arrays;
public class Assignment_3 {
    public static void main(String[] args) {

        //Write a function called middle that takes a list and return a new list that contains all but the first and last element

        int [] array = {1,2,3,4,5,6,5};

        finalArray(array);

    }
    public static void finalArray(int[] array) {

        int [] finalArray = new int[array.length-2];

            for(int i = 0; i<finalArray.length; i++)
            {
                finalArray[i] = array[i+1];
            }

        System.out.println(Arrays.toString(finalArray));
    }
}
