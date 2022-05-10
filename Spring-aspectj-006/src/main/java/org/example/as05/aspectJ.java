package org.example.as05;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aspectJ {
    @Before(value = "myCut()")
    //@Before(value = "execution(public String org.example.as05.*.*(String))")
    public void myBefore() {
        System.out.println("前置通知........");
    }

    @AfterReturning(value = "myCut()", returning = "obj")
    //@AfterReturning(value = "execution(* org.example.as05.*.*(..))",returning = "obj")
    public void myAfterReturn(Object obj) {
        System.out.println("后置通知..........");
    }

    @Around(value = "myCut()")
    //@Around(value = "execution(* org.example.as05.*.*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知...............");
        return pjp.proceed(pjp.getArgs()).toString().toUpperCase();
    }

    @After(value = "myCut()")
    //@After(value = "execution(* org.example.as05.*.*(..))")
    public void myAfter() {
        System.out.println("最终通知..........");
    }

    @Pointcut(value = "execution(* org.example.as05.*.*(String))")
    public void myCut() {
    }

    ;
}
