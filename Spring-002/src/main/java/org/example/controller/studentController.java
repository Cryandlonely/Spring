package org.example.controller;

import org.example.Service.Impl.studentServiceImpl;
import org.example.Service.studentService;

public class studentController {
    studentService studentService = new studentServiceImpl();
    public String getName(String name){
        return studentService.getName(name);
    }
}
