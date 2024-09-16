package com.redis_crud_operation.redis_integration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig
{

    @Bean
    public RedisConnectionFactory connectionFactory(){
        return new  LettuceConnectionFactory();
          }


    @Bean
    public RedisTemplate<String, Object> redisTemplate(){

        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();

        //connection serilization
        redisTemplate.setConnectionFactory(connectionFactory());

        //Key serilization
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        //Value serilization
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());

        return redisTemplate;
    }
}
