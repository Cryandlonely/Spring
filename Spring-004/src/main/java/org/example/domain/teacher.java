package org.example.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class teacher {
    @Value("li")
    private String name;
    @Value("女")
    private String sex;

    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
