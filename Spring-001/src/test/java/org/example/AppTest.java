package org.example;

import static org.junit.Assert.assertTrue;

import org.example.domain.School;
import org.example.domain.Student;
import org.example.domain.Student01;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{
    @Test
    public void TestApp(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student) ac.getBean("student");
        System.out.println(stu);
    }
    @Test
    public void TestApp01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student01 student01 = (Student01) ac.getBean("student01");
        System.out.println(student01);
    }
}
