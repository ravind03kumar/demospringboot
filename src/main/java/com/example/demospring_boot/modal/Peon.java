package com.example.demospring_boot.modal;

public class Peon {

    String name;
    int age;
    String Address;

    public Peon(String name, int age, String address) {
        this.name = name;
        this.age = age;
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
