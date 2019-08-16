package com.qf.cglibproxy;

public class Main {
    public static void main(String[] args) {
        UserInfoDao userInfoDao=new UserInfoDao();
        CglibHelper helper=new CglibHelper();
        UserInfoDao proxy = (UserInfoDao) helper.getProxy(userInfoDao.getClass());
      proxy.selectUserInfoList(1);
    }
}
