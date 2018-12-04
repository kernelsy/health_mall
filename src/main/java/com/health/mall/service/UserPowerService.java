package com.health.mall.service;


import com.health.mall.po.UserPower;
import com.health.mall.repository.UserPowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class UserPowerService {

    @Autowired
    UserPowerRepository powerRepository;

    public UserPower create(UserPower power){
        power.setCreateTime(new Date());
        return power;
    }

    public UserPower update(UserPower power){
        power.setUpdateTime(new Date());
        return power;
    }
}
