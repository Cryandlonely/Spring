package org.example.controller;

import org.example.service.studentService;

public class studentController {
    private studentService studentService;

    public void setStudentService(studentService studentService) {
        this.studentService = studentService;
    }

    public String getName(String name) {
        return studentService.getName(name);
    }
}
