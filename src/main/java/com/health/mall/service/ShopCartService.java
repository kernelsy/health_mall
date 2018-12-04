package com.health.mall.service;


import com.health.mall.po.ShopCart;
import com.health.mall.repository.ShopCartRepository;
import com.health.mall.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class ShopCartService {


    @Autowired
    ShopCartRepository shopCartRepository;

    public ShopCart create(ShopCart shopCart){
        shopCart.setAccount(Account.account);
        shopCart.setCreateTime(new Date());
        return shopCart;
    }

    public ShopCart update(ShopCart shopCart){
        shopCart.setUpdateTime(new Date());
        return shopCart;
    }


}
