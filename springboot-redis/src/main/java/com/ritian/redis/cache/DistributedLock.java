package com.ritian.redis.cache;

import org.redisson.api.RLock;

/**
 * TODO
 *
 * @author ritian
 * @since 2019/7/28 21:29
 **/
public interface DistributedLock {

    RLock lock(String lockKey);

    void unLock(RLock lock);
}
