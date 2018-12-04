package com.health.mall.service;


import com.health.mall.po.Order;
import com.health.mall.repository.OrderRepository;
import com.health.mall.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order create(Order order){
        order.setAccount(Account.account);
        order.setCreateTime(new Date());
        return orderRepository.save(order);
    }

    public Order update(Order order){
        order.setUpdateTime(new Date());
        return orderRepository.save(order);
    }
}
