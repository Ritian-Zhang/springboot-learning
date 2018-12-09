package com.ritian.springboot.mapper;

import com.ritian.springboot.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ritian.Zhang
 * @date 2018/12/06
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    
    @Resource
    private UserMapper userMapper;
    
    @Test
    public void list() throws  Exception{
        List<User> list = userMapper.list();
        Assert.assertEquals(2,list.size());
    }
    
}
