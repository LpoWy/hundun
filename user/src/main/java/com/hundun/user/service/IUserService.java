package com.hundun.user.service;

import com.hundun.user.entity.User;

import java.util.List;

/**
 * ******************************************************************************************************************
 * CreateDate             Author             TaskManage             Descriptions
 * 2019-08-28              @author LP           后台管理模块设计           积分controller
 * ******************************************************************************************************************
 */
public interface IUserService {
    List<User> getUserList();

    Integer saveUser(User user);

    User getUserById(Integer id);
}
