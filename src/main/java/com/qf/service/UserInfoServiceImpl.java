package com.qf.service;

import com.alibaba.druid.util.StringUtils;
import com.qf.dao.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    public boolean loginCheck(String userName, String password) {
        if(StringUtils.isEmpty(userName)||StringUtils.isEmpty(password)){
            throw new NullPointerException("用户名和密码为空");
//                       return false;
        }
        return userInfoMapper.loginCheck(userName,password);
    }
}
