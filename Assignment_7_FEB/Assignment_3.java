package com.company.Assignment_7_FEB;
import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args) {

        //Highest occurrence character

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = sc.nextLine();

        char a ;
        char b ;
        int count = 0;
        int temp = 0;
        char contchar = ' ';

        for(int i = 0; i<=word.length()-1; i++)
        {
            a = word.charAt(i);

            for (int j = 0; j <=word.length()-1; j++)
            {
                b = word.charAt(j);

                if(a==b)
                {
                    count++;
                }
            }
            if(count>temp)
            {
                temp = count;
                contchar = a;
            }
            count = 0;
        }
        System.out.println("Highest occurrence character "+contchar);
    }
}
