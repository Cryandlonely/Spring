package org.example;

import org.example.as05.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {

    @Test
    public void Test05(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ac05/applicationContext.xml");
        someService someService = (someService) ac.getBean("someServiceImpl");
        System.out.println(someService.doSome("name"));
    }
}
