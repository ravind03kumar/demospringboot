package com.example.demospring_boot.modal;

public class Doctor {
    String name;
    int age;
    String Department;

    public Doctor(String name, int age, String department) {
        this.name = name;
        this.age = age;
        Department = department;
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

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
