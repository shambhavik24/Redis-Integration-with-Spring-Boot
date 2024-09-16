package com.redis_crud_operation.redis_integration.controller;

import com.redis_crud_operation.redis_integration.dao.UserDao;
import com.redis_crud_operation.redis_integration.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDao userDao;

    // create User
    @PostMapping()
    public Users createUsers(@RequestBody Users users){
        users.setUserId(UUID.randomUUID().toString());
        return userDao.save(users);
    }

    //get Single users
    @GetMapping("/{UserId}")
    public Users getUser(@PathVariable ("UserId") String UserId){
        return userDao.get(UserId);
    }

    //findAll
    @GetMapping
    public Map<Object, Object> findAll(){
        return  userDao.findAll();
    }

    //Delete User
    @DeleteMapping("/{UserId}")
    public void deleteUser(@PathVariable String UserId){
        userDao.delete(UserId);
    }



}
