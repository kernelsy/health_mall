package com.health.mall.web;

import com.health.mall.po.Member;
import com.health.mall.service.MemberService;
import com.health.mall.util.RedisUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(description = "member-API")
@RestController
@RequestMapping("/api/member")
public class MemberController {

    @Autowired
    MemberService memberService;



    @PostMapping
    public Member save(@RequestBody Member member){
        if (member.getId()!=null){
            return memberService.update(member);
        }
        return memberService.create(member);
    }



}
