package com.ritian.redis.web;

import com.ritian.redis.cache.DistributedLock;
import org.redisson.api.RBucket;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author ritian
 * @since 2019/7/28 21:34
 **/
@RestController
public class TestController {

    @Resource
    DistributedLock distributedLock;

    @Resource
    RedissonClient redissonClient;

    @RequestMapping("/{key}/lock")
    public boolean test(@PathVariable String key) throws Exception {
        RLock lock = redissonClient.getLock(key);
        boolean b = lock.tryLock(2000, 10*1000, TimeUnit.MILLISECONDS);
        if(b){
            System.out.println(1);
        }
        return b;
    }

    @RequestMapping("/{key}/unlock")
    public boolean unlock(@PathVariable String key) {
        RLock lock = distributedLock.lock(key);
        distributedLock.unLock(lock);
        return lock.isLocked();

    }

    @RequestMapping("/get")
    public String get(String key) {
        RBucket<String> bucket = redissonClient.getBucket(key);
        return bucket.get();


    }

    @RequestMapping("/set")
    public boolean set(String key, String value) {
        RBucket<String> bucket = redissonClient.getBucket(key);
        bucket.set(value);
        return true;
    }
}
