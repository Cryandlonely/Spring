package org.example.Service.Impl;

import org.example.Service.studentService;
import org.example.dao.studentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentServiceImpl implements studentService {
    @Autowired
    studentDao studentDao;

    @Override
    public String getName(String name) {
        System.out.println("service");
        return studentDao.getName(name);
    }
}
