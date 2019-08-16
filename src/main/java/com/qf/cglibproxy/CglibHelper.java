package com.qf.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

public class CglibHelper implements MethodInterceptor {
    public Object getProxy(Class clazz){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }



    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long startTime = new Date().getTime();
        Object o1 = methodProxy.invokeSuper(o, objects);
        long endTime = new Date().getTime();
        long displayTime = endTime - startTime;
        System.out.println("调用时间"+displayTime);
         return o1;
    }
}
