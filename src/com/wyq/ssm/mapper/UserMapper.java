package com.wyq.ssm.mapper;

import com.wyq.ssm.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    void addUser(User user);

    List<User> listAll();
}
