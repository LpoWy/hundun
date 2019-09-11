package com.order.order.service.impl;

import com.order.order.entity.Order;
import com.order.order.mapper.OrderMapper;
import com.order.order.service.IOrderService;
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
public class OrderServiceImpl implements IOrderService {
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrderList() {
        return orderMapper.getOrderList();
    }

    @Override
    public Integer saveOrder(Order order) {
        return orderMapper.saveOrder(order);
    }

    @Override
    public Integer updateOrder(Order order) {
        return orderMapper.updateOrder(order);
    }
}
