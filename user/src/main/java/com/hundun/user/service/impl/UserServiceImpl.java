package com.hundun.user.service.impl;


import com.hundun.user.entity.User;
import com.hundun.user.mapper.UserMapper;
import com.hundun.user.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ******************************************************************************************************************
 * CreateDate             Author             TaskManage             Descriptions
 * 2019-08-28              @author LP           后台管理模块设计           积分controller
 * ******************************************************************************************************************
 */
@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {

    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public Integer saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
