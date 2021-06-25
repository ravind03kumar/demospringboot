package com.example.demospring_boot.controller;

import com.example.demospring_boot.modal.Doctor;
import com.example.demospring_boot.modal.Engineer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerDoctor {
    List<Doctor> list=new ArrayList<>();

    @RequestMapping("/add_doc")
    public String add(@RequestBody Doctor doctor){
        list.add(doctor);
        return doctor.getName()+"added succussfully";
    }

@RequestMapping("/list_doc")
    public List<Doctor>get_list(){

    return list;
    }
    @RequestMapping("/remove_a")
    public String remove(){

        list.remove(0);
        return "remove successfully";
    }
}
