package com.health.mall.service;


import com.health.mall.po.ProductSpec;
import com.health.mall.repository.ProductSpecRepository;
import com.health.mall.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class ProductSpecService {

    @Autowired
    ProductSpecRepository specRepository;

    public ProductSpec create(ProductSpec productSpec){
        productSpec.setAccount(Account.account);
        productSpec.setCreateTime(new Date());
        return productSpec;
    }

    public ProductSpec update(ProductSpec productSpec){
        productSpec.setUpdateTime(new Date());
        return productSpec;
    }


}
