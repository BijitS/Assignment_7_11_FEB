package com.company.Assignment_8_FEB;

public class Assignment_1 {
    public static void main(String[] args) {

        //Write a method which returns a string by removing special charaters( &,$,:,+,@) spaces from the string
        //   Input: ""Geekster-The%school:where+you@code:your-success$stories""
        //   Output : ""Geekster The school where you code your success stories

        String input = "Geekster-The%school:where+you@code:your-success$stories";

        input = (input.replace("-"," "));
        input = (input.replace("%"," "));
        input = (input.replace(":"," "));
        input = (input.replace("+"," "));
        input = (input.replace("@"," "));
        input = (input.replace("$"," "));

        System.out.println(input);
    }
}
