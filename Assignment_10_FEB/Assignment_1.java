package com.company.Assignment_10_FEB;
import java.util.Arrays;
public class Assignment_1 {
    public static void main(String[] args) {

        //WAP to reverse an array

        String [] array = {"Hello","guys","how","are","you"};

        Reversearray(array);
    }

    public static void Reversearray(String[] array) {


        for (int i = 0; i < array.length/2; i++)
        {

            String temp = array[i];

            array[i] = array[array.length - i - 1];

            array[array.length - i - 1] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}
