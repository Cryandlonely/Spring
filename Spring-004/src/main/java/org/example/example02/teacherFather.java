package org.example.example02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("teacherFather")
public class teacherFather {
    @Value("张三")
    private String name;
    @Value("河北")
    private String address;

    @Override
    public String toString() {
        return "teacherFather{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public teacherFather() {
        System.out.println("teacherFather无参构造");
    }
}
