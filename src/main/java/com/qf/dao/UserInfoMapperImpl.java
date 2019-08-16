package com.qf.dao;

import org.springframework.stereotype.Component;

@Component
public class UserInfoMapperImpl implements UserInfoMapper{
    public boolean loginCheck(String userName, String password) {
        if("aaa".equals(userName)&&"bbb".equals(password)){
        return true;
        }
        return false;
    }
}
