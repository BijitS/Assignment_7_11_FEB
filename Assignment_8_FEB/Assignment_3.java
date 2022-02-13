package com.company.Assignment_8_FEB;

import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {

        //Write a method which accepts 10 digits mobile number as an Integer parameter and return a string containing
        //country code with mobile number.
        //Input: 7890765456
        //Output :+91-7890765456

        System.out.println("+91-"+number());

    }
    private static String number()
    {

        Scanner sc  = new Scanner(System.in);
        long N = sc.nextLong();

        String mobilenum = Long.toString(N);

        return mobilenum;
    }
}
