package com.example.demospring_boot.controller;

import com.example.demospring_boot.modal.Employee;
import com.example.demospring_boot.modal.Engineer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerEngineer {

    List<Engineer> list=new ArrayList<>();

    @RequestMapping("/add_eng")
    public String add(@RequestBody Engineer engineer){
        list.add(engineer);
        return engineer.getName() + "Added Successfully ....";
    }

    @RequestMapping("/eng_list")
    public List<Engineer> get_list(){
        return list;
    }
    @RequestMapping("/remove")
    public String remove(){

        list.remove(0);
        return "removed Successfully......";
    }

}
