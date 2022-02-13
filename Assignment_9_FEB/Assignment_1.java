package com.company.Assignment_9_FEB;
import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {

        // Make an array with user inputs of size 10.Then find sum of all elements in array

        int[] N = new int[10];

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        answer(N,sc,sum);

    }

    public static void answer(int[] N, Scanner sc,int sum) {

        //Input elements
        for(int i = 0; i<N.length; i++)
        {
            System.out.print("Enter number ");
            N[i] = sc.nextInt();
        }

        //add all the elements
        for(int j = 0; j<N.length; j++)
        {
            sum = sum + N[j];
        }

        System.out.print("Sum of all elements in a Array = "+sum);
    }
}
