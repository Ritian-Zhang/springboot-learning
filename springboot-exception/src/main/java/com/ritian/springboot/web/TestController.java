package com.ritian.springboot.web;

import com.ritian.springboot.exception.NotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ritian.Zhang
 * @date 2018/12/09
 **/
@RestController
public class TestController {

    @RequestMapping("/error500")
    public void index() {
        int a = 1 / 0;
        System.out.println(a);
    }

    @RequestMapping("/error404")
    public void error404() throws Exception {
        throw  new NotFoundException("not found");
    }
}
