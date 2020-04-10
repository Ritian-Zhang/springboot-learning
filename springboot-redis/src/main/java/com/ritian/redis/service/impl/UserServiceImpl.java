package com.ritian.redis.service.impl;

import com.ritian.redis.pojo.User;
import com.ritian.redis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author ritian
 * @since 2020/4/3 14:33
 **/
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    @Cacheable(cacheNames = "user", key = "#userId")
    public User getUser(String userId) {
        log.info("get user from db .");
        User user = new User();
        user.setId("20200410");
        user.setUserName("jack");
        return user;
    }
}
