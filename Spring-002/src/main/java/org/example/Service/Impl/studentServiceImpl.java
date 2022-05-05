package org.example.Service.Impl;

import org.example.Service.studentService;
import org.example.dao.Impl.studentDaoImpl;
import org.example.dao.studentDao;

public class studentServiceImpl implements studentService {
    studentDao studentDao = new studentDaoImpl();
    @Override
    public String getName(String name) {
        System.out.println("service");
        return studentDao.getName(name);
    }
}
