package com.health.mall.service;

import com.health.mall.po.Province;
import com.health.mall.repository.ProvinceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProvinceService {

    private static final Logger log = LoggerFactory.getLogger(ProvinceService.class);

    @Autowired
    ProvinceRepository provinceRepository;


    public Province getProvinceById(String province){
        log.info("provinceId:{}",province);
        return provinceRepository.findByProvince(province);
    }

    public List<Province> getAll(){
        return provinceRepository.findAll();
    }
}
