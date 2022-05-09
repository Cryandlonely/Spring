package org.example.as02;

import org.springframework.stereotype.Service;

@Service
public class someServiceImpl implements someService{
    @Override
    public String getString(String name) {
        System.out.println("service");
        return name;
    }

    @Override
    public Student getStudent() {
        return new Student("zhangsan","123");
    }
}
