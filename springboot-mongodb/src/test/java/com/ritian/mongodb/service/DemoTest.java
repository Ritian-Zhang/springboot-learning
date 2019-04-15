package com.ritian.mongodb.service;

import com.ritian.mongodb.ApplicationTests;
import com.ritian.mongodb.entity.User;
import org.junit.Test;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import javax.annotation.Resource;

/**
 * @author ritian.Zhang
 * @date 2019/04/15
 **/
public class DemoTest extends ApplicationTests {

    @Resource
    MongoTemplate mongoTemplate;

    @Test
    public void query() throws Exception{
        User user = this.mongoTemplate.findOne(new Query(), User.class);
        System.out.println(user.toString());
    }
}
