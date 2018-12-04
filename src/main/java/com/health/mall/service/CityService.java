package com.health.mall.service;

import com.health.mall.po.City;
import com.health.mall.repository.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityService {

    private static final Logger log = LoggerFactory.getLogger(CityService.class);

    @Autowired
    CityRepository cityRepository;


    public List<City> getCityByProvince(String province){
        return cityRepository.getAllByProvinceId(province);
    }




}
