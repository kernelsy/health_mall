package com.health.mall.service;


import com.health.mall.po.ShopCartItems;
import com.health.mall.repository.ShopCartItemsRepository;
import com.health.mall.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class ShopCartItemsService {



    @Autowired
    ShopCartItemsRepository itemsRepository;


    public ShopCartItems create(ShopCartItems items){
        items.setAccount(Account.account);
        items.setCreateTime(new Date());
        return items;
    }


    public ShopCartItems update(ShopCartItems items){
        items.setUpdateTime(new Date());
        return items;
    }

}
