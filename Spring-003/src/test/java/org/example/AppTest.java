package org.example;

import org.example.controller.studentController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    @Test
    public void Test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        studentController controller = (studentController) ac.getBean("controller");
        System.out.println(controller.getName("li"));
    }
}
