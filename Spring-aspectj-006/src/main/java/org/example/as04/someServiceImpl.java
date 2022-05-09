package org.example.as04;

import org.springframework.stereotype.Service;

@Service
public class someServiceImpl implements someService{
    @Override
    public String doSome() {
        return "aaa";
    }
}
