package org.example.controller;

import org.example.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class studentController {
    @Autowired
    studentService studentService;
    public String getName(String name){
        return studentService.getName(name);
    }
}
