package com.qf;

import com.qf.service.CustomerService;
import com.qf.service.UserInfoService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //初始化spring工厂
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-aop.xml");
//        UserInfoService bean= applicationContext.getBean(UserInfoService.class);
//        boolean flag = bean.loginCheck("aaa", "bbb");
//        System.out.println(flag);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-aop.xml");
        CustomerService bean= applicationContext.getBean(CustomerService.class);
       // boolean flag = bean.delete();
       // System.out.println(flag);

    }

}
