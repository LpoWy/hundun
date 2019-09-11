package com.hundun.user.controller;

import com.hundun.user.entity.User;
import com.hundun.user.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * ******************************************************************************************************************
 * CreateDate             Author             TaskManage             Descriptions
 * 2019-08-28              @author LP           后台管理模块设计           积分controller
 * ******************************************************************************************************************
 */
@RestController
@AllArgsConstructor
@RequestMapping("user")
public class UserController {
private IUserService userService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return "say hello spring  boot!";
    }

    @GetMapping("/getUserList")
    public List<User> getUserList(){
        return userService.getUserList();
    }

}
