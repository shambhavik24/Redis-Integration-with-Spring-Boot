package com.redis_crud_operation.redis_integration.dao;


import com.redis_crud_operation.redis_integration.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository
public class UserDao {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String KEY = "USER";

    //Save user
    public Users save(Users users){
        redisTemplate.opsForHash().put(KEY, users.getUserId(),users);
        return users;
    }

    //get User

    public Users get(String UserId){
       return (Users) redisTemplate.opsForHash().get(KEY, UserId);
    }

    //findAll

    public Map<Object, Object> findAll(){
        return redisTemplate.opsForHash().entries(KEY);
    }

    //Delete

    public void delete(String UserId){
        redisTemplate.opsForHash().delete(UserId);
    }
}
