package com.order.order;

import com.order.order.entity.Order;
import com.order.order.service.IOrderService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderApplicationTests {

    @Autowired
    private IOrderService orderService;
    @Test
    public void contextLoads() {
    }

    @Before
    public void before() {
        System.out.println("测试开始");
    }

    @After
    public void after() {
        System.out.println("测试结束");
    }


    @Test
    public void getOrderList(){
        List<Order> orders = orderService.getOrderList();
        System.out.println(orders);
    }

    @Test
    public void saveOrder(){
        Order order = new Order();
        order.setAmount(1);
        order.setOrderName("订饭");
        order.setAccountId(1);
        order.setOrderNum("21541");
        order.setCreateTime(LocalDateTime.now());
        orderService.saveOrder(order);
    }

    @Test
    public void updateOrder(){
        Order order = new Order();
        order.setId(1);
        order.setAmount(1);
        order.setAccountId(1);
        order.setOrderName("订饭");
        order.setOrderNum("21541");
        order.setCreateTime(LocalDateTime.now());
        orderService.updateOrder(order);
    }
}
