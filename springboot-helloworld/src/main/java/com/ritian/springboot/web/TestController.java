package com.ritian.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ritian.Zhang
 * @date 2018/12/05
 **/
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot 2.0!";
    }
}
