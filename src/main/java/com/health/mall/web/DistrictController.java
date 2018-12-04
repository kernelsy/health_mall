package com.health.mall.web;


import com.health.mall.po.District;
import com.health.mall.service.DistrictService;
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

@Api(description = "district-API")
@RestController
@RequestMapping("/api/district")
public class DistrictController {

    private static final Logger log = LoggerFactory.getLogger(DistrictController.class);


    @Autowired
    DistrictService districtService;

    @GetMapping("/getDistrict/{city}")
    public List<District> getDistrict(@PathVariable String city){
        log.info("city:{}",city);
        List<District> district = districtService.getDistrict(city);
        if (district == null) {
            return new ArrayList<>();
        }else {
            return district;
        }
    }

}
