package com.health.mall.service.dto;

import com.health.mall.po.Product;
import com.health.mall.po.ProductType;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ProductTypeDTO extends ProductType {

    private List<Product> productList;

}
