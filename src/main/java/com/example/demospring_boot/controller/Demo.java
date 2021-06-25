package com.example.demospring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Demo {
   // List<String> list=new ArrayList<>();
    List<Integer> list =new ArrayList<>();

    @RequestMapping("/demo")
    public List<String> demo(){
        List<String> list=new ArrayList<>();
        list.add("Aman");
        list.add("kumar");
        return list;
    }
    @RequestMapping("/demo_list")
    public List<Integer>demo1(){
        List<Integer>list=new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);
        return list;

    }

}
