package com.ritian.mongodb.web;

import com.ritian.mongodb.entity.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @author ritian.Zhang
 * @date 2019/04/15
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    MongoTemplate mongoTemplate;

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        user.setUserId(UUID.randomUUID().toString());
        mongoTemplate.save(user, "users");
    }

    @GetMapping("list")
    public List<User> list() {
        return mongoTemplate.find(new Query(), User.class, "users");
    }

    @GetMapping("get/{userId}")
    public User getById(@PathVariable String userId) {
        return mongoTemplate.findById(userId, User.class);
    }

    @PostMapping("delete/{userId}")
    public void delete(@PathVariable String userId) {
        mongoTemplate.remove(new Query(Criteria.where("userId").is(userId)), User.class);
    }

}
