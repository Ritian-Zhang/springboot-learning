package com.ritian.redis.service;

import com.ritian.redis.pojo.User;

/**
 *
 * @author ritian
 * @since 2020/4/3 14:32
 **/
public interface UserService {

    User getUser(String userId);
}
