package com.example.demospring_boot.controller;

import com.example.demospring_boot.modal.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerPerson {

    @RequestMapping("/details")
    public Person name(){
        Person person=new Person("Kali charan",32,"pata");
        return person;
    }


    @RequestMapping("/get_details")
    public List<Person> get_list(){
        List<Person> list=new ArrayList<>();
        Person person=new Person("Kali charan",32,"pata");
        Person person1=new Person("Kali chacha",43,"pata");
        list.add(person);
        list.add(person1);
        return list;
    }
}
