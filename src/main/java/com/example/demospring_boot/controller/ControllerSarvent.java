package com.example.demospring_boot.controller;

import com.example.demospring_boot.modal.Sarvent;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerSarvent {
List<Sarvent> list=new ArrayList<>();

@RequestMapping("/add_sar")
public String add(@RequestBody Sarvent sarvent){
    list.add(sarvent);
    return sarvent.getName()+"added successfully";


}
@RequestMapping("/sar_list")
public  List<Sarvent> getList() {
    return list;
}
@RequestMapping("/remover")
public String remove(){
    list.remove(0);
    return "remove successfully";
}


    }

