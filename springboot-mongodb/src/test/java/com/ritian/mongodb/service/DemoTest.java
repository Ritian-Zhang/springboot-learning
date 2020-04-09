package com.ritian.mongodb.service;

import com.ritian.mongodb.ApplicationTests;
import com.ritian.mongodb.entity.DemoDocument;
import com.ritian.mongodb.entity.Student;
import com.ritian.mongodb.entity.User;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author ritian.Zhang
 * @date 2019/04/15
 **/
public class DemoTest extends ApplicationTests {

    @Resource
    MongoTemplate mongoTemplate;

    @Test
    public void query() throws Exception {
        DemoDocument user = this.mongoTemplate.findOne(new Query(), DemoDocument.class);
        System.out.println(user.toString());
    }

    @Test
    public void save() throws Exception {
        DemoDocument t = DemoDocument.builder()
                .id(10003L)
                .name("demo3")
                .desc("测试3")
                .createTime("2019-09-01 10:30:00")
                .build();
        DemoDocument d = this.mongoTemplate.save(t);
        System.out.println(t.toString());

    }

    @Test
    public void saveStu() {
        long start = System.currentTimeMillis();
        for (int i = 1000001; i < 10*1000 * 1000; i++) {
            Student student = new Student();
            student.setName("jay".concat(i + ""));
            student.setAge(i + i % 10);
            student.setSex(i % 2 == 0 ? 1 : 2);
            student.setStuNo(i + 1 + "");
            this.mongoTemplate.save(student);
        }
        System.out.println("耗时："+(System.currentTimeMillis()-start));

    }
}
