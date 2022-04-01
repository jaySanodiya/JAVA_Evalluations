package com.fifth;

import java.util.*;
import java.util.stream.Stream;

public class Mobile {

    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model) {

        Set<Map.Entry<String ,ArrayList<String>>> set= mobiles.entrySet();
        ArrayList<String> value = (ArrayList<String>) set.stream().map(s->{
            if(s.getKey()==company)
                return s.getValue();
            else return null;
        });
        value.add(model);
        mobiles.put(company,value );

        return  "Mobile added successfully";
    }

    public ArrayList<String> getModels(String company){
        Set<Map.Entry<String ,ArrayList<String>>> set= mobiles.entrySet();
        ArrayList<String> list = (ArrayList<String>) set.stream().map(s->{
            if(s.getKey()==company)
                return s.getValue();
            else return null;
        });

        return list;
        //This method return the list of all the models of the supplied company
        //if we supply any invalid company name then it should return null value
    }

    public static void main(String[] args) {



        Mobile mobile = new Mobile();
//        String res = mobile.addMobile("apple","Iphone13");

//        System.out.println(res);

        ArrayList<String> list = mobile.getModels("apple");

        list.stream().forEach(s-> System.out.println(s));
    }
}
