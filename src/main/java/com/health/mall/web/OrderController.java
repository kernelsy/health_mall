package com.health.mall.web;

import com.health.mall.service.OrderItemService;
import com.health.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderItemService itemService;

    @Autowired
    OrderService orderService;

}
