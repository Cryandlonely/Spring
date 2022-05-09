package org.example.as04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aspectJ {
    /*
        最终通知规范：
            1.访问权限是public
            2.方法没有返回值
            3.方法名称自定义
            4.方法没有参数，如果有只能是JoinPoint
            5.使用@After注解表明是最终通知
                参数：
                    value：指定切入点表达式
     */
    @After(value = "execution(* org.example.as04.*.*(..))")
    public void myAfter(){
        System.out.println("最终通知。。。。。");
    }
}
