package com.health.mall.service;


import com.health.mall.po.User;
import com.health.mall.po.UserRole;
import com.health.mall.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class UserRoleService {



    @Autowired
    UserRoleRepository roleRepository;

    public UserRole create(UserRole role){
        role.setCreateTime(new Date());
        return role;
    }

    public UserRole update(UserRole role){
        role.setUpdateTime(new Date());
        return role;
    }


}
