package org.example.example02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*

 */
@Component
public class student {
    @Value("李四")
    private String name;
    @Value("001")
    private String id;
    @Autowired
    private school school;
    /*
        当父类与子类没有被指定名称时：
            引用属性的属性名与子类默认名称相同时，会引用子类

        在进行引用注入并且具有多个注入对象时会进行筛选，第一次：按照引用类型筛选
                                              第二次：按照与注入对象相同名称的对象进行注入

        @Autowired
        private teacherFather teacherSon;
    */

    public student() {
        System.out.println("student无参构造");
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", school=" + school +
                '}';
    }
}
