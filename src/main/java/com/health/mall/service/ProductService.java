package com.health.mall.service;


import com.health.mall.po.Product;
import com.health.mall.po.ProductImg;
import com.health.mall.po.ProductSku;
import com.health.mall.repository.ProductImgRepository;
import com.health.mall.repository.ProductRepository;
import com.health.mall.repository.ProductSkuRepository;
import com.health.mall.po.Account;
import com.health.mall.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class ProductService {



    @Autowired
    ProductRepository productRepository;

    @Autowired
    CodeUtil codeUtil;

    @Autowired
    ProductSkuRepository skuRepository;

    @Autowired
    ProductImgRepository imgRepository;


    public ProductImg create(ProductImg productImg){
        productImg.setAccount(Account.account);
        productImg.setCreateTime(new Date());
        return productImg;
    }


    public ProductImg update(ProductImg productImg){
        productImg.setUpdateTime(new Date());
        return productImg;
    }

    public ProductSku create(ProductSku productSku){
        productSku.setAccount(Account.account);
        productSku.setCreateTime(new Date());
        return productSku;
    }

    public ProductSku update(ProductSku productSku){
        productSku.setUpdateTime(new Date());
        return productSku;
    }

    public Product create(Product product){
        product.setAccount(Account.account);
        product.setProductCode(codeUtil.getProductCode());
        product.setCreateTime(new Date());
        return productRepository.save(product);
    }

    public Product update(Product product){
        product.setUpdateTime(new Date());
        return productRepository.save(product);
    }




}
