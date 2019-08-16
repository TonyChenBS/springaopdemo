package com.qf.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class Helper implements InvocationHandler {
    Object target;

    public Helper(Object another){
        target=another;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Date startTime=new Date();
        Object invoke = method.invoke(target, args);
        Date endTime=new Date();
        long displayTime = endTime.getTime() - startTime.getTime();
        String methodName=method.getName();
        System.out.println(methodName+"方法调用时间:"+displayTime);
        if (methodName.indexOf("select")!=-1){

        }else {
            System.out.println("事务提交");
        }

        return invoke;
    }
}
