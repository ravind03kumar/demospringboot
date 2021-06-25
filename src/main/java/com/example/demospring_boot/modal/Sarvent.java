package com.example.demospring_boot.modal;

public class Sarvent {
    String name;
    int age;
    String dress;

    public Sarvent(String name, int age, String dress) {
        this.name = name;
        this.age = age;
        this.dress = dress;
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

    public String getDress() {
        return dress;
    }

    public void setDress(String dress) {
        this.dress = dress;
    }
}
