package com.health.mall.service;


import com.health.mall.po.ProductType;
import com.health.mall.repository.ProductTypeRepository;
import com.health.mall.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class ProductTypeService {

    @Autowired
    ProductTypeRepository typeRepository;

    public ProductType create(ProductType productType){
        productType.setAccount(Account.account);
        productType.setCreateTime(new Date());
        return typeRepository.save(productType);
    }

    public ProductType update(ProductType productType){
        productType.setUpdateTime(new Date());
        return typeRepository.save(productType);
    }


}
