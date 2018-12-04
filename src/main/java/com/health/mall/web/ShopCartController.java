package com.health.mall.web;


import com.health.mall.service.ShopCartItemsService;
import com.health.mall.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shopcart")
public class ShopCartController {

    @Autowired
    ShopCartItemsService itemsService;

    @Autowired
    ShopCartService shopCartService;


}
