package com.health.mall.web;


import com.health.mall.service.UserPowerService;
import com.health.mall.service.UserRoleService;
import com.health.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserPowerService powerService;

    @Autowired
    UserRoleService roleService;

    @Autowired
    UserService userService;

}
