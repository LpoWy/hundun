package com.hundun.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * ******************************************************************************************************************
 * CreateDate             Author             TaskManage             Descriptions
 * 2019-08-28              @author LP           后台管理模块设计           积分controller
 * ******************************************************************************************************************
 */
@Data
@EqualsAndHashCode
public class User {
    private Integer userOid;
    private String userName;
    private String password;
    private Integer sex;
    private Integer age;
    private String mobile;
    private String email;
    private String address;
    private String status;
    private String updateBy;
    private LocalDateTime updateTime;
    private String createBy;
    private LocalDateTime createTime;
    private Integer versions;
}
