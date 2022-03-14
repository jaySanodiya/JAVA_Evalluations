package com.Question02;

import java.util.Scanner;

public class StringManipulator {
    public String removeVowels(String input){
        String[] vowels = {"a","e","i","o","u"};
        String[] array = new String[input.length()];
        char[] chr = input.toCharArray();


        for(char c:chr){
            if(true){

            }
        }
        return  "welcome";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid String");
        String input = sc.next();


        StringManipulator s1 = new StringManipulator();
        System.out.println(s1.removeVowels(input));
    }
}
