package com.ritian.springboot.controller;

import com.ritian.springboot.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author ritian.Zhang
 * @date 2018/12/09
 **/
@RestController
@RequestMapping("/demo")
@Api(value = "测试Swagger2",description="简单的API")
public class UserController {
    @ApiOperation(value = "获取指定id用户详细信息", notes = "根据user的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户id", dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Integer id) {
        User user = new User();
        user.setId(id);
        user.setAge(20);
        //user.setCreateDate(new Date());
        user.setUsername("jack");
        return user;
    }

    @ApiIgnore// 使用该注解忽略这个API
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String  test() {
        return " hi swagger!";
    }
}
