package org.example;

import static org.junit.Assert.assertTrue;

import org.example.controller.studentController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    三层架构的改造（基于注解式开发）
 */
public class AppTest {
    @Test
    public void Test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");
        studentController studentController = (studentController) ac.getBean("studentController");
        System.out.println(studentController.getName("li"));
    }
}
