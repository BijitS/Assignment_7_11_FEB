package com.company.Assignment_7_FEB;
import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {

        //Reverse each word

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = sc.nextLine();

        String reverse = "";

        for(int i = 0; i<=word.length()-1; i++)
        {
            reverse = word.charAt(i) + reverse;
        }

        System.out.println(reverse);

        }
    }

