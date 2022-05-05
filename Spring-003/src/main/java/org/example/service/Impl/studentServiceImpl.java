package org.example.service.Impl;

import org.example.dao.studentDao;
import org.example.service.studentService;

public class studentServiceImpl implements studentService {
    private studentDao studentDao;

    public void setStudentDao(studentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public String getName(String name) {
        System.out.println("service");
        return studentDao.getName(name);
    }
}
