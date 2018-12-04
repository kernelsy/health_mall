package com.health.mall.web;

import com.health.mall.po.City;
import com.health.mall.service.CityService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(description = "city-API")
@RestController
@RequestMapping("/api/city")
public class CityController {

    private static final Logger log = LoggerFactory.getLogger(CityController.class);


    @Autowired
    CityService cityService;

    @GetMapping("/getCity/{province}")
    public List<City> getCityByProvince(@PathVariable String province){
        log.info("province:{}",province);
        List<City> city = cityService.getCityByProvince(province);
        if (city==null){
            return new ArrayList<>();
        }else {
            return city;
        }
    }


}
