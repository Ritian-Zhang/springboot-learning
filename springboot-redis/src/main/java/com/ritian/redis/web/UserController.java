package com.ritian.redis.web;

import com.ritian.redis.pojo.User;
import com.ritian.redis.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author ritian
 * @since 2020/4/10 16:45
 **/
@RestController("/user")
public class UserController {

    @Resource
    UserService userService;


    @GetMapping("/get/{id}")
    public User get(@PathVariable("id") String id){
        return userService.getUser(id);
    }

}
