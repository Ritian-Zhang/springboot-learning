package com.ritian.springboot.web;

import com.ritian.springboot.entity.User;
import com.ritian.springboot.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ritian.Zhang
 * @date 2018/12/05
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @PostMapping("/list")
    public List<User> list(){
        return userMapper.list();
    }


}
