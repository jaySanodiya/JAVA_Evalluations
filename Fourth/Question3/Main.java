package com.Fourth.Question3;

import java.util.*;

public class Main {

    public Map<String,Employee> getSortedMapWithValue(Map<String,Employee> originalMap){

        Set<Map.Entry<String,Employee>> mapEmployees = originalMap.entrySet(); //to maintaine order we will use set

        List<Map.Entry<String,Employee>> list = new ArrayList<>(mapEmployees); //creating list to use sort method

        list.sort(new SortBySalary()); //sorted by salary usnig sortBySAlary class

        LinkedHashMap<String,Employee> linked = new LinkedHashMap<>(); //converting back to child of map so that oder in maintained

        for (Map.Entry<String,Employee> employee: list) {
            linked.put(employee.getKey(),employee.getValue()); //assigning vlaues from list array to linked hashmap

        }


        return linked; // returning in correct type.
    }

    public static void main(String[] args) {

        HashMap<String ,Employee> hashMap = new HashMap<>(); //HashMap is created now data will be added to it.

        hashMap.put("HR",new Employee("3886","Jay",60000.00));
        hashMap.put("Sales",new Employee("3887","Vijay",50000.00));
        hashMap.put("Marketing",new Employee("2886","Ajay",40000.00));
        hashMap.put("Accounts",new Employee("3586","Jaya",80000.00));

        Main m1 = new Main(); //creating object of main class to call non-static method

        Map<String,Employee> result = m1.getSortedMapWithValue(hashMap);  //storing the return value from getSortedMapWithValue method

        Set<Map.Entry<String,Employee>> mapEntry = result.entrySet(); //using set so that order is not change again

        for (Map.Entry<String, Employee> set: mapEntry) {  //to pring each value
            System.out.println("Department Name : " + set.getKey());
            System.out.println("Employee Details : " + set.getValue());
        }
    }
}
