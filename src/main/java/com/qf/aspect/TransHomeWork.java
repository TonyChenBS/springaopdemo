package com.qf.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
public class TransHomeWork {
    //定义切点
    @Pointcut(value = "execution(* com.qf.service.*.delete(String))")
    public void point(){

    }
    @After(value = "point()")
    public void displayAfter(){
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println("format");
    }

    //环绕调用
    @Around(value = "point()")
    public boolean around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("inner around 1.....");
        //调用业务方法
        Object[] args = joinPoint.getArgs();
        if (args[0].toString().equals("IBM")){
            return false;
        }
        boolean flag = Boolean.parseBoolean(joinPoint.proceed().toString());
        System.out.println("inner around 2.....");
        return flag;
    }
}
