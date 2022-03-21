package com.Second.Question03;

import java.util.Scanner;

public class PrintingRangeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Start value");
        int Start = sc.nextInt();

        System.out.println("Enter End Value");
        int End = sc.nextInt();

        System.out.println("Enter Increment Value");
        int inc = sc.nextInt();

        if(inc<=0||Start>End){
            System.out.println("Error");
        }
        else{
            for(int i=Start;i<=End;i=i+inc){
                System.out.print(i + " ");
            }
        }
    }
}
