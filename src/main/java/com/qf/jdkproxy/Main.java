package com.qf.jdkproxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
//        Task p=new Person();
//        Helper helper=new Helper(p);
//       Task o =(Task)Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass().getInterfaces(), helper);
//       o.doSomething();
        BaseDao demoDaoObj=new DemoDao();
        Helper helper=new Helper(demoDaoObj);
        BaseDao o = (BaseDao)Proxy.newProxyInstance(demoDaoObj.getClass().getClassLoader(), demoDaoObj.getClass().getInterfaces(), helper);
        o.addObj(1);
//      o.selectList(1);
       // o.selectOne(1);
//       o.addObj(1);
        //o.update(1);
//        o.addObj(1);
//        o.deleteObj(1);
    }

}
