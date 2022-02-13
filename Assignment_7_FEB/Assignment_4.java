package com.company.Assignment_7_FEB;

public class Assignment_4 {
    public static void main(String[] args) {

        //If strings are equal or not

        String a = "Bijit";
        String b = "Bijit";

        System.out.println(a==b);  //Same reference

        String c = new String("Sonowal");
        String d = new String("Sonowal");

        System.out.println(c==d);      //False because both are different object which is created in heap but outside the String poll

        System.out.println(c.equals(d));
    }
}
