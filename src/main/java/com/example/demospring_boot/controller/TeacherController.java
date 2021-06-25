package com.example.demospring_boot.controller;

import com.example.demospring_boot.modal.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeacherController {
List<Teacher>teacherList=new ArrayList<>();

@RequestMapping("/get_teacher")
    public List<Teacher>teacherList(){
        return teacherList;
    }
    @RequestMapping("add_teacher")
    public String add_teacher(){
    Teacher teacher=new Teacher("Vinod",27,"science");
    return "added.."+teacher.getName();
    }


    @RequestMapping("/remove_teacher")
    public String remove_teacher(){
    try {
        teacherList.remove(0);
        return "remove_teacher.."+teacherList.get(0).getName();

    }
    catch (Exception ex){
        return "exception occured";
    }
    }
    @RequestMapping("/update_teacher")
    public String updateteacher(){
    Teacher teacher=teacherList.get(0);
    teacher.setName("kumar");
    teacherList.add(teacher);
    return "update teacher.."+teacher.getName();
    }
}

