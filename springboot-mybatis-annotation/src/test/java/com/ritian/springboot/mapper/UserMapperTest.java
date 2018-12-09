package com.ritian.springboot.mapper;

import com.ritian.springboot.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ritian.Zhang
 * @date 2018/12/05
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

   // @Test
    public void testSave(){
        userMapper.save(new User("tom",11));
    }
    @Test
    public void testList(){
        List<User> list = userMapper.list();
        System.out.println(list.size());
    }
}
