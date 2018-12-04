package com.health.mall.config;


import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableCaching
public class RedisConfig  {


    @Bean
    public RedisTemplate<String,?> redisTemplate(RedisConnectionFactory connectionFactory){
        RedisTemplate<String,?> template = new RedisTemplate<>();
        Jackson2JsonRedisSerializer<?> j = new Jackson2JsonRedisSerializer<Object>(Object.class);
        //value
        template.setValueSerializer(j);
        template.setHashValueSerializer(j);
        //key
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setKeySerializer(new StringRedisSerializer());
        template.setConnectionFactory(connectionFactory);
        return template;
    }



}