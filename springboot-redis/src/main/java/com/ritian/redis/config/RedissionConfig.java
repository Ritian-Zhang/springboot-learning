package com.ritian.redis.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * redission 配置
 *
 * @author ritian
 * @since 2019/7/28 20:55
 **/
@Configuration
public class RedissionConfig {

    @Bean
    public RedissonClient redissonClient() {
        return Redisson.create();
    }


}
