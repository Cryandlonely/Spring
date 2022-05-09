package org.example.as01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Aspect
@Component
public class aspectJ {

    /*
        所有切面的功能都是由切面方法来实现的
        可以将各种切面都在此类中是实现

        前置通知的切面方法的规范：
        1.访问权限是public(可以省略)
        2.方法的返回值是void
        3.方法名称自定义
        4.方法没有参数，如果有也只能是JoinPoint类型
        5.必须使用@Before注解来声明切入的时机是切面功能和切入点
            参数：value   指定切入点的表达式

        规范公式：execution(访问权限 方法返回值 方法声明(参数) 异常类型)
        简化后的公式：execution(方法返回值 方法声明(参数))

        * 代表任意的字符(通配符)
        .. 如果出现在方法的参数中，则代表任意参数
           如果出现在路径中，则代表路径及其所有的子路径
     */

    @Before(value = "execution(public String org.example.as01.someService.doSome(String,int))")
    /*
        public void myBefore(){
            System.out.println("切面方法实现。。。。。。。");
        }
    */
    public void myBefore(JoinPoint joinPoint){
        System.out.println("切面方法实现。。。。。。。");
        System.out.println("目标方法的签名："+joinPoint.getSignature());
        System.out.println("目标方法的参数："+ Arrays.toString(joinPoint.getArgs()));
    }
}
