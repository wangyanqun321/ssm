package com.wyq.ssm.service.impl;

import com.wyq.ssm.mapper.UserMapper;
import com.wyq.ssm.pojo.User;
import com.wyq.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {

    }

    @Override
    public List<User> get() {

        return userMapper.listAll();
    }
}
