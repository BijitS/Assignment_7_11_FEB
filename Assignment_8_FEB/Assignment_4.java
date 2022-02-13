package com.company.Assignment_8_FEB;

public class Assignment_4 {
    public static void main(String[] args) {


        //Write a method which accepts a String as a parameter and returns ratio of vowels to consonants in String format
        //Input: We are Proud to be an India
        //Output :11:10

        String N = "We are Proud to be an India";

        vowelConsonant(N);
    }

    private static void vowelConsonant(String N) {
        int countVowel = 0;

        int countConsonants = 0;

        N = N.replace(" ", "");

        for (int i = 0; i < N.length(); i++)
        {
            char c = N.charAt(i);

            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
            {
                countVowel++;
            }
            else
            {
                countConsonants++;
            }
        }
            System.out.println(countVowel+":"+ countConsonants);
        }
    }




