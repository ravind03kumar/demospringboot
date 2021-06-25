package com.example.demospring_boot.controller;

import com.example.demospring_boot.modal.Employee;
import com.example.demospring_boot.modal.Engineer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerEmployee {
    List<Employee> list=new ArrayList<>(); // list of object

    @RequestMapping("/add_emp") //end point
    public String  add(@RequestBody Employee employee){  //method
            list.add(employee);
        return employee.getName() + "Added Successfully ....";  //return value
    }

    @RequestMapping("/emp_list") //end point
    public List<Employee> get_list(){  //method

        return list; //return value
    }
    @RequestMapping("/remove1") //end point
    public String remove(){  //method

        list.remove(0);
        return "removed Successfully......";
    }
}
