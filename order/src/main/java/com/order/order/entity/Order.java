package com.order.order.entity;

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
public class Order {
    private Integer id;
    private Integer accountId;
    private String orderName;
    private String orderNum;
    private Integer amount;
    private LocalDateTime createTime;
}
