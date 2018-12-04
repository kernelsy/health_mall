package com.health.mall.service;


import com.health.mall.po.Member;
import com.health.mall.repository.MemberRepository;
import com.health.mall.po.Account;
import com.health.mall.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    StringRedisTemplate srt;

    @Autowired
    RedisTemplate<Object,Object> rt;


    public Member create(Member member) {
        member.setAccount(Account.account);
        member.setCreateTime(new Date());
        redisUtil.set(member.getAccount()+member.getMobile(),member.getMobile(),60L);
        return memberRepository.save(member);
    }

    public Member update(Member member) {
        member.setUpdateTime(new Date());
        return memberRepository.save(member);
    }
}
