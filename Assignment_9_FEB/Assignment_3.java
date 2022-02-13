package com.company.Assignment_9_FEB;
import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args) {

        //Make an array with user inputs of size 10. then print all positive numbers in an array

        Scanner sc = new Scanner(System.in);

        int[] N = new int[10];

        answer(N,sc);

    }

    public static void answer(int[]N,Scanner sc) {


        //taking input
        for(int i = 0; i<N.length; i++)
        {
            System.out.print("Enter a number = ");
            N[i] = sc.nextInt();
        }

        //all positive numbers in a array
        for(int j = 0; j<N.length; j++)
        {
            if(N[j]>0)
            {
                System.out.println("Positive number in a Array = "+N[j]);
            }
        }
    }
}
