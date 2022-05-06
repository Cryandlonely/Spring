package org.example.example02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
    引用注入
 */
@Component
public class student01 {
    @Value("李四")
    private String name;
    @Value("001")
    private String id;

    /*
        当使用@Qualifier("teacherFather")进行指定是可以对多个可注入对象进行指定筛选
        并且@Autowired与@Qualifier注解需要同时写上
     */
    @Autowired
    //@Qualifier("teacherFather")
    @Qualifier("teacherSon")
    private teacherFather teacherFather;

    public student01() {
        System.out.println("student01无参构造");
    }

    @Override
    public String toString() {
        return "student01{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", teacherFather=" + teacherFather +
                '}';
    }
}
