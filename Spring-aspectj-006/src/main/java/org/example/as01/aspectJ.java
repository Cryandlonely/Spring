package org.example.as01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class aspectJ {

    /*
        所有切面的功能都是由切面方法来实现的
        可以将各种切面都在此类中是实现

        前置通知的切面方法的规范：
        1.访问权限是public
        2.方法的返回值是void
        3.方法名称自定义
        4.方法没有参数，如果有也只能是JoinPoint类型
        5.必须使用@Before注解来声明切入的时机是切面功能和切入点
            参数：value   指定切入点的表达式
     */

    @Before(value = "execution(public String org.example.as01.someService.doSome(String,int))")
    public void myBefore(){
        System.out.println("切面方法实现。。。。。。。");
    }
}
