package com.Fourth.Question2;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address("MadhyaPradesh","Seoni","480661");

        Employee employee = new Employee("3886","Jay Sanodiya",address,"jay.sanodiya09@gmail.com","helloWorld");

        FileOutputStream fos = new FileOutputStream("emp.txt"); //fos will create and point on emp.txt file
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(employee); //employee is serialized now

        oos.flush(); // it is optional statement
        oos.close(); // oos is closed

        System.out.println("Seriazation Done...");

        System.out.println("Deseriolisation Starts......");
        //Start deseriolising the emp.txt file

        FileInputStream fis = new FileInputStream("emp.txt"); //pointiong on file

        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee empl = (Employee) ois.readObject();

        System.out.println("Employee name is " +  empl.empName);
        System.out.println("Employee Id is " + empl.empId);
        System.out.println("Employee state is " + empl.address.state);
        System.out.println("Employee city is " + empl.address.city);
        System.out.println("Employee pin code is " + empl.address.pinCode);
        System.out.println("Employee email is " + empl.empId);
        System.out.println("Employee password is " + empl.password); // it will be null










    }
}
