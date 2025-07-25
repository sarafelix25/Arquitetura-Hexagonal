package com.example.hexagonal.application.core.domain;

public class Address {
    
    public Address() {}
    
    public Address(String city, String state, String street) {
        this.city = city;
        this.state = state;
        this.street = street;
    }
    
    private String street;
    private String city;
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
