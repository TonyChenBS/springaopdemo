package com.qf.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class TransDemoAnnocation {
    //定义切点
    @Pointcut(value = "execution(* com.qf.service.*.*(..))")
    public void point(){

    }
    //之前调用
    @Before(value = "point()")
    public void begin(){
        System.out.println("inner begin");
    }
    //之后调用
    @After(value = "point()")
    public void end(){
        System.out.println("inner end");
    }
    //方法返回之后调用
    @AfterReturning(value = "point()")
    public void afterRuturn(){
        System.out.println("方法返回之后");
    }
    //环绕调用
    @Around(value = "point()")
    public boolean around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("inner around 1.....");
        //调用业务方法
        boolean flag = Boolean.parseBoolean(joinPoint.proceed().toString());
        System.out.println("inner around 2.....");
        return flag;
    }
    //异常抛出调用
    @AfterThrowing(value = "point()")
    public void throwAfter(){
        System.out.println("inner throwAfter");
    }
}
