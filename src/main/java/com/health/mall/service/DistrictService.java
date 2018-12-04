package com.health.mall.service;


import com.health.mall.po.District;
import com.health.mall.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DistrictService {

    @Autowired
    DistrictRepository districtRepository;


    public List<District> getDistrict(String cityId){
        return districtRepository.getAllByCityId(cityId);
    }

}
