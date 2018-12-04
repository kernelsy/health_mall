package com.health.mall.service;


import com.health.mall.po.OrderItem;
import com.health.mall.repository.OrderItemRepository;
import com.health.mall.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class OrderItemService {


    @Autowired
    OrderItemRepository itemRepository;

    public OrderItem create(OrderItem orderItem){
        orderItem.setAccount(Account.account);
        orderItem.setCreateTime(new Date());
        return itemRepository.save(orderItem);
    }

    public OrderItem update(OrderItem orderItem){
        orderItem.setUpdateTime(new Date());
        return itemRepository.save(orderItem);
    }

}
