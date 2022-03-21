package com.Second.Question02;

import java.util.Scanner;

public class StringManipulator {
    public String removeVowels(String input){
        if(input==null){
            return "null";
        }
        else{
            String[] vowels = {"a","e","i","o","u"};
            String[] array = new String[input.length()];
            char[] chr = input.toCharArray();



            for(int i=0;i<input.length();i++){
                int count = 0;
                for(int j=0;j<5;j++){
                    if(vowels[j].toCharArray()[0] == chr[i]){
                        array[i]="";
                        break;
                    }
                    else{
                        count++;
                    }
                }

                if(count==5){
                    array[i] = String.valueOf(chr[i]);
                }
            }
            return  String.join("", array);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid String");
        String input = sc.next();


        StringManipulator s1 = new StringManipulator();
        System.out.println(s1.removeVowels(input));
    }
}
