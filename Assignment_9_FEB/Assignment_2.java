package com.company.Assignment_9_FEB;
import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args) {

        //Make an array with user inputs of size 10.Then find middle element in an array

        Scanner sc = new Scanner(System.in);

        int[] N = new int[10];

        answer(N,sc);
    }


    public static void answer(int[] N,Scanner sc){

        //taking input
        for(int i = 0; i<N.length; i++)
        {
            System.out.print("Enter a number = ");
            N[i] = sc.nextInt();
        }

        //middle element from a array
        int middle = (N.length/2)-1;

        System.out.print("Middle element in an Array is = "+N[middle]);
    }
}
