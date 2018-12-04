package com.health.mall.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class CodeUtil {

    private static final String PREFIX = "HEALTH_MALL";
    private static final String MEMBER_CODE_SUFFER = "MEMBER_CODE_SUFFER";
    private static final String PRODUCT_CODE_SUFFER = "PRODUCT_CODE_SUFFER";

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public String getProductCode() {
        ValueOperations<String, String> operation = redisTemplate.opsForValue();
        long productCodeSuffer = operation.increment(PRODUCT_CODE_SUFFER, 1);
        String codeSuffer;
        codeSuffer = StringUtils.leftPad(String.valueOf(productCodeSuffer), 8, "0");
        return PREFIX + codeSuffer;
    }





}
