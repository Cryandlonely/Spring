package org.example.as05;

import org.springframework.stereotype.Service;

@Service
public class someServiceImpl implements someService{
    @Override
    public String doSome(String name) {
        System.out.println("service..................");
        return name;
    }
}
