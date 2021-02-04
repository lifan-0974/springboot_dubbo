package com.lllfff.service;

import com.lllfff.model.User;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public User selectById(Integer id) {
        User user=new User();
        user.setUserId(id);
        user.setUsername("张三");
        System.out.print("接收到客户端ID"+id);
        return user;
    }
}
