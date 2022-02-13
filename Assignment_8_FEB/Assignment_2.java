package com.company.Assignment_8_FEB;

public class Assignment_2 {
    public static void main(String[] args) {

        //WAP to prove that intern() method guarantees to return unique String from a String pool

        String a = "Bijit";

        String b = new String("Bijit");

        boolean equal = a==b;

        System.out.println(equal); // False because both have difference reference

        equal = a==b.intern();
        System.out.println(equal); //True because String b will first go to string poll and check is same value is exit or not if exist it share the  same reference

    }
}
