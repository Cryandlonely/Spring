package org.example.as03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aspectJ {
    /*
        环绕通知方法规范：
        1.访问权限是public
        2.切面方法有返回值，此返回值就是目标方法的返回值
        3.方法名称自定义
        4.方法有参数，此参数就是目标方法
        5.回避异常Throwable
        6.使用@Around注解声明是环绕通知
            参数：
                value：指定切入点表达式
     */
    @Around(value = "execution(* org.example.as03.*.*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("前置通知。。。。。。。。");
        Object obj = pjp.proceed(pjp.getArgs());
        System.out.println("后置通知。。。。。。。。");
        return obj.toString().toUpperCase();  //改变目标方法的返回值
    }
}
