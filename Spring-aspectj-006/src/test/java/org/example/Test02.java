package org.example;

import org.example.as02.Student;
import org.example.as02.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    /*
        后置通知
     */
    @Test
    public void Test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ac02/applicationContext.xml");
        someService service = (someService) ac.getBean("someServiceImpl");

        String str = service.getString("zhang");
        System.out.println(str);

        /*
            引用
         */

        Student stu =service.getStudent();
        System.out.println(stu);
    }
}
