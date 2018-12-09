package com.ritian.springboot.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * @author ritian.Zhang
 * @date 2018/12/06
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Resource
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setUp() throws  Exception{
         mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    @Test
    public void list() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/user/list").accept(MediaType.APPLICATION_JSON_UTF8));
    }

}
