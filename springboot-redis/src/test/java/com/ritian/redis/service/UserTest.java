package com.ritian.redis.service;

import com.ritian.redis.BaseTests;
import com.ritian.redis.pojo.User;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * TEST
 *
 * @author ritian
 * @since 2020/4/10 16:39
 **/
public class UserTest extends BaseTests {

    @Resource
    UserService userService;

    @Test
    public void test(){
        User user = userService.getUser("20200410");

        System.out.println(user.toString());
    }

}
