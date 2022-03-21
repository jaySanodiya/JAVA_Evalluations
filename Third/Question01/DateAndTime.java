package com.Third.Question01;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth in dd/MM/yyyy format");
        String dob = sc.next();

        try{
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ld = LocalDate.parse(dob,dtf);
            LocalDate curr = LocalDate.now();
            if(ChronoUnit.YEARS.between(ld,curr)<0){
                System.out.println("Date of birth should not be in future");
            }
            else{
                System.out.println("You are "+ChronoUnit.YEARS.between(ld,curr) + " Year Old");

            }

        }
        catch (Exception err){
            System.out.println("please pass the date in the proper format");
        }
    }
}
