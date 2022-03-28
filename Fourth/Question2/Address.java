package com.Fourth.Question2;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable {
    String state;
    String city;
    String pinCode;

    public Address(String state, String city, String pinCode) {
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(state, address.state) && Objects.equals(city, address.city) && Objects.equals(pinCode, address.pinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, city, pinCode);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
