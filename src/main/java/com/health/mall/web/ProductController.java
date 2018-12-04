package com.health.mall.web;

import com.health.mall.po.Product;
import com.health.mall.po.ProductImg;
import com.health.mall.po.ProductSpec;
import com.health.mall.po.ProductType;
import com.health.mall.service.*;
import com.health.mall.util.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(description = "product-API")
@RestController
@RequestMapping("/api/product")
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductTypeService typeService;

    @Autowired
    ProductSpecService specService;

    @Autowired
    ProductService productService;


    /**
     * save to productType
     * @param productType
     * @return
     */
    @PostMapping("/save/type")
    @ApiOperation(value = "保存商品分类",notes = "保存商品分类")
    public ResponseData save(@RequestBody ProductType productType){
        ResponseData data = new ResponseData();
        if (productType.getId()!=null){
            data.setData(typeService.update(productType));
            data.setCount(1);
            data.setMsg("修改成功!");
            data.setStatus(0);
        }else {
            data.setData(typeService.create(productType));
            data.setCount(1);
            data.setMsg("添加成功!");
            data.setStatus(0);
        }
        return data;
    }



    @PostMapping("/save")
    @ApiOperation(value = "保存商品分类",notes = "保存商品分类")
    public ResponseData save(@RequestBody Product product){
        ResponseData data = new ResponseData();
        if (product.getId()!=null){
            data.setData(productService.update(product));
            data.setCount(1);
            data.setMsg("修改成功!");
            data.setStatus(0);
        }else {
            data.setData(productService.create(product));
            data.setCount(1);
            data.setMsg("添加成功!");
            data.setStatus(0);
        }
        return data;
    }


}
