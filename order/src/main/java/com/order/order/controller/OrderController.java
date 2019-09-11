package com.order.order.controller;

import com.order.order.entity.Order;
import com.order.order.service.IOrderService;
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
@RequestMapping("order")
public class OrderController {
    private IOrderService orderService;
    @GetMapping("/getOrderList")
    public List<Order> getOrder() {
        List<Order> Orders = orderService.getOrderList();
        return Orders;
    }

    @GetMapping("/saveOrder")
    public Integer saveOrder() {
        Order Order = new Order();
        Integer Orders = orderService.saveOrder(Order);
        return Orders;
    }

    @GetMapping("/updateOrder")
    public Integer updateOrder() {
        Order Order = new Order();
        Integer Orders = orderService.updateOrder(Order);
        return Orders;
    }
}
