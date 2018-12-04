package com.health.mall.service.dto;

import com.health.mall.po.Product;
import com.health.mall.po.ProductImg;
import lombok.Data;

@Data
public class ProductImgDTO extends ProductImg {

    private Product product;
}
