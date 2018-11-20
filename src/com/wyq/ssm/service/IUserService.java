package com.wyq.ssm.service;

import com.wyq.ssm.pojo.User;

import java.util.List;

public interface IUserService {

    void addUser(User user);

    List<User> get();


}
