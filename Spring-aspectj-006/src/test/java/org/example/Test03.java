package org.example;

import org.example.as03.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    /*
        环绕通知
     */

    @Test
    public void Test03(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ac03/applicationContext.xml");
        someService someService = (someService) ac.getBean("someServiceImpl");
        System.out.println(someService.doSome());
    }
}
