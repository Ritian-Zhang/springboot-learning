package com.ritian.springboot.mapper;

import com.github.pagehelper.PageHelper;
import com.ritian.springboot.SpringbootMybatisMapperApplicationTests;
import com.ritian.springboot.model.User;
import org.junit.Assert;
import org.junit.Test;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ritian.Zhang
 * @date 2018/12/23
 **/
public class UserMapperTest extends SpringbootMybatisMapperApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void save(){
        //插入
        int res = userMapper.insert(new User().setAge(18).setNickname("tom"));
        Assert.assertTrue(res>0);
    }

    @Test
    public void delete(){
        //删
        Assert.assertTrue(userMapper.deleteByPrimaryKey(9)>0);
    }

    @Test
    public void update(){
        //更新
        userMapper.updateByPrimaryKeySelective(new User().setId(7).setAge(88));
    }
    @Test
    public void select(){
        userMapper.selectByPrimaryKey(1);
        //查询所有
        userMapper.selectAll();
        //条件查询
        List<User> age = userMapper.selectByExample(Example.builder(User.class).where(Sqls.custom().andLessThan("age", 30)).build());
        //分页查询
        PageHelper.startPage(1,5);
        userMapper.selectAll();
    }
}
