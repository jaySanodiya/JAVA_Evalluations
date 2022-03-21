package com.Third.Question02;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private int empId;
    private String name;
    private String Address;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int empId, String name, String address, double salary) {
        this.empId = empId;
        this.name = name;
        Address = address;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(Address, employee.Address);

    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, Address, salary);
    }


    @Override
    public int compareTo(Employee employee) {
        if(this.salary>employee.salary){
            return -1;
        }
        else if(this.salary<employee.salary){
            return +1;
        }
        else {
            return employee.name.compareTo(name);
        }
    }
}
