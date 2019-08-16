package com.qf.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class TransDemo {
    //之前调用
    public void begin(){
        System.out.println("inner begin");
    }
    //之后调用
    public void end(){
        System.out.println("inner end");
    }
    //环绕调用
    public boolean around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("inner around 1.....");
        //调用业务方法
        boolean flag = Boolean.parseBoolean(joinPoint.proceed().toString());
        System.out.println("inner around 2.....");
        return flag;
    }
    //异常抛出调用
    public void throwAfter(){
        System.out.println("inner throwAfter");
    }

}
