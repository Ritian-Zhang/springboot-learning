package com.ritian.springboot.mapper;

import com.ritian.springboot.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ritian.Zhang
 * @date 2018/12/05
 **/
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> list();

    @Insert("INSERT INTO user(nickname,age) VALUES(#{nickname}, #{age})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void save( User user);
}
