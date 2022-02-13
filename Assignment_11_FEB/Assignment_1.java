package com.company.Assignment_11_FEB;

public class Assignment_1 {
    public static void main(String[] args) {

        //Find max product of two integer in the array where all elements are positive

        int[] array = {10, 20, 30, 40, 50};

        int N = array.length;

        maxProduct(array, N);

    }

    static void maxProduct(int array[], int N)
    {
        int max1 = array[0];
        int max2 = array[1];


        for (int i = 0; i < N; i++)
        {
            for (int j = i + 1; j < N; j++)
            {
                if (array[i] * array[j] > max1 * max2)
                {
                    max1 = array[i];
                    max2 = array[j];
                }
            }
        }
        System.out.println("Max product of two integer in the array [" + max1 + ", " + max2 + "]" + " = "+max1*max2);
    }
}



