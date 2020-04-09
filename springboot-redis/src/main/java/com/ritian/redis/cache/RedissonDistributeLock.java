package com.ritian.redis.cache;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author ritian
 * @since 2019/7/28 21:32
 **/
@Component
public class RedissonDistributeLock implements DistributedLock {
    @Resource
    RedissonClient redissonClient;

    @Override
    public RLock lock(String lockKey) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock();
        return lock;
    }

    @Override
    public void unLock(RLock lock) {

        lock.unlock();
    }
}
