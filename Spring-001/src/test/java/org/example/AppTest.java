package org.example;

import static org.junit.Assert.assertTrue;

import org.example.domain.School;
import org.example.domain.Student;
import org.example.domain.Student01;
import org.example.domain.Student02;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{
    /*
        简单类型注入
    */
    @Test
    public void TestApp(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student) ac.getBean("student");
        System.out.println(stu);
    }
    /*
        引用类型注入
    */
    @Test
    public void TestApp01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student01 student01 = (Student01) ac.getBean("student01");
        System.out.println(student01);
    }
    /*
        构造方法参数名称注入
     */
    @Test
    public void TestApp02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student02 student02 = (Student02) ac.getBean("student02");
        System.out.println(student02);
    }
    /*
        构造方法参数下标注入
     */
    /*
        构造方法参数默认顺序注入
     */
}
