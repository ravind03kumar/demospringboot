package com.example.demospring_boot.controller;

import com.example.demospring_boot.modal.Child;
import com.example.demospring_boot.modal.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerChild {
    List<Child> childList=new ArrayList<>();


    @RequestMapping("/get_child")
    public List<Child>childList() {
        return childList;
    }

    @RequestMapping("/add_child")
    public String add_child(){

        Child child=new Child("Rohit"+23+"yellow");
        return "added.."+child.getName();
    }

}
