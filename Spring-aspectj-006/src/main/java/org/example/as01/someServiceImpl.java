package org.example.as01;

import org.springframework.stereotype.Component;

@Component
public class someServiceImpl implements someService{
    @Override
    public String doSome(String name, int id) {
        return name;
    }
}
