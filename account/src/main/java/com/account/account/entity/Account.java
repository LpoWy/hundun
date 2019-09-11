package com.account.account.entity;

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
public class Account {
    private Integer id;
    private String account;
    private String accountNum;
    private String type;
    private Integer amount;
    private LocalDateTime createTime;
}
