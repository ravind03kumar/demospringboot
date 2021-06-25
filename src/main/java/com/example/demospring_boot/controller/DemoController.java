package com.example.demospring_boot.controller;

import com.example.demospring_boot.modal.Engineer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    List<Engineer>engineerList=new ArrayList<>();

    //Path variable
@RequestMapping("/greeting/{message}")
    public String greeting(@PathVariable String message) {
        String greeting="path variable for method...."+message;
        return greeting;
    }


    @RequestMapping("/greeting_int/{int_var}")
    public String demo_int(@PathVariable int int_var){
        String greeting="path variable accepted in method..."+int_var;
        return greeting;
    }
}
