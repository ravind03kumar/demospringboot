package com.example.demospring_boot.controller;

import com.example.demospring_boot.modal.Peon;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerPeon {

    @RequestMapping("/peom")
    public Peon name(){
        Peon peon=new Peon("Pawan",32,"firozabad");
        return peon;

    }
    @RequestMapping("/peon_list")
    public List<Peon> get_list(){
        List<Peon> list=new ArrayList<>();
        Peon peon=new Peon("Pawan",32,"firozabad");
        Peon peon2=new Peon("Param",32,"firozabad");
        Peon peon1=new Peon("Paras",32,"firozabad");
        list.add(peon);
        list.add(peon2);
        list.add(peon1);
        return list;
    }
}
