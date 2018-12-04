package com.health.mall.web;


import com.health.mall.po.Province;
import com.health.mall.service.ProvinceService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(description = "province-API")
@RestController
@RequestMapping("/api/province")
public class ProvinceController {

    private static final Logger log = LoggerFactory.getLogger(ProvinceService.class);

    @Autowired
    ProvinceService provinceService;


    @GetMapping("/getProvinceId/{province}")
    public Province getProvince(@PathVariable String province){
        log.info("provinceId:{}",province);
        Province province1 = provinceService.getProvinceById(province);
        if (province1==null) {
            return null;
        }else{
            return province1;
        }
    }


    @GetMapping("/getAll")
    public List<Province> getAll(){
        List<Province> province = provinceService.getAll();
        if (province==null) {
            return new ArrayList<>();
        }else{
            return province;
        }
    }

}
