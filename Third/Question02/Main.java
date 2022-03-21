package com.Third.Question02;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Employee> emp =new TreeSet<>();

        System.out.println("Enter Employee details");

        int count = 0;
        while(count<5){
            count++;
            System.out.println("Employee 0"+ count);
            System.out.println("Enterr name");
            String name = sc.next();

            System.out.println("Enter Id");
            int Id = sc.nextInt();

            System.out.println("Enter Address");
            String add = sc.next();

            System.out.println("Enter salary");
            double salary = sc.nextInt();

            Employee employee = new Employee(Id,name,add,salary);
            emp.add(employee);

        }

        System.out.println(emp);

    }

}
