package org.example;

import org.example.as04.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    /*
        最终通知
     */
    @Test
    public void Test04(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ac04/applicationContext.xml");
        someService some = (someService) ac.getBean("someServiceImpl");
        System.out.println(some.doSome());
    }
}
