package org.example.domain;

import org.springframework.stereotype.Component;

@Component("stu")  //交给Spring去创建对象（在容器启动时创建）
                   //创建对象的默认名称是类名的驼峰命名法，也可以指定对象的名称@Component("指定名称")
public class student {
    private String name;
    private Integer id;

    public student() {
        System.out.println("无参构造方法");
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
