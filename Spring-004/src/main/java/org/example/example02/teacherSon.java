package org.example.example02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("teacherSon")
public class teacherSon extends teacherFather{
    @Value("王五")
    private String name;
    @Value("北京")
    private String address;

    @Override
    public String toString() {
        return "teacherSon{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public teacherSon() {
        System.out.println("teacherSon无参构造");
    }
}
