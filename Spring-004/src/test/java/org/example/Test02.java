package org.example;

import org.example.example02.student;
import org.example.example02.student01;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    /*
         引用类型注入
     */
    @Test
    public void Test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("resources02./applicationContext.xml");
        student s = (student) ac.getBean("student");
        System.out.println(s);
    }
    @Test
    public void Test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("resources02./applicationContext.xml");
        student01 s = (student01) ac.getBean("student01");
        System.out.println(s);
    }
}
