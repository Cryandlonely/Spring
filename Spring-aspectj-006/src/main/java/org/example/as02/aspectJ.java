package org.example.as02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aspectJ {
    /*
        后置通知的方法规范：
        1.访问权限是public
        2.方法没有返回值void
        3.方法名称自定义
        4.方法有参数(也可以没有参数,如果目标方法没有返回值,则可以写无参的方法,但一般会写有参,这样可以处理无参也可以处理有参),这个切面方法的参数就是目标方法的返回值
        5.使用@AfterReturning注解表明是后置通知：
            参数：
                value:指定的切入点表达式
                returning:指定目标方法的返回值的名称,则名称必须与切面方法的参数名称一致

         如果目标方法的返回值是8种基本类型或String的类型，则不可以改变
         如果目标方法的返回值是引用类型,则可以改变
     */
    @AfterReturning(value = "execution(* org.example.as02.someServiceImpl.*(..))", returning = "obj")
    public void myAfterReturning(Object obj) {
        System.out.println("后置通知。。。。。。。。。");
        if (obj instanceof Student) {
            Student stu = (Student) obj;
            stu.setName("liming");
            stu.setId("789");
        }
    }
}
