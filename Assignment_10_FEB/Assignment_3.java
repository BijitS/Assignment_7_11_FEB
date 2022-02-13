package com.company.Assignment_10_FEB;

public class Assignment_3 {
    public static void main(String[] args) {

        //WAP to find first index at which element is present in array

        int [] array = {1,2,3,3,3,3,4,5,6,76};

        int randno = 3;

        int index = 0;

        int temp = 0;

        for (int i = 1; i < array.length; i++)
        {
                if(randno == array[i])
                {
                    index = i;

                    temp = index;

                    if(temp<index)
                    {
                        index = temp;
                    }
                }
        }
        System.out.println("First index at which element is present in array is "+ index);

    }
}
