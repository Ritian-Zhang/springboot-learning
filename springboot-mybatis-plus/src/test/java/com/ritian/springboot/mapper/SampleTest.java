package com.ritian.springboot.mapper;

import com.baomidou.mybatisplus.core.conditions.query.EmptyWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ritian.springboot.SpringbootMybatisPlusApplicationTests;
import com.ritian.springboot.entity.User;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * crud test
 * @author ritian.Zhang
 * @date 2018/12/21
 **/
public class SampleTest extends SpringbootMybatisPlusApplicationTests {
    @Resource
    private UserMapper userMapper;

   // @Test
    public void insert(){
        User user  = new User("pp",20);
        Assert.assertTrue(userMapper.insert(user)>0);
        System.out.println(user.getId());
    }

    //@Test
    public void delete(){
        Assert.assertTrue( userMapper.deleteById(3)>0);
    }

    //@Test
    public  void update(){
        Assert.assertTrue(userMapper.updateById(new User().setId(1).setAge(25))>0);
    }

    @Test
    public void select(){
        //根据id查询
        User user = userMapper.selectById(1);
        //查询所有
        userMapper.selectList(new EmptyWrapper<>());
        //条件查询
        userMapper.selectList(new QueryWrapper<User>().gt("age",18));
        //分页查询
        userMapper.selectPage(new Page<>(2,3), new EmptyWrapper<>());
    }

}
