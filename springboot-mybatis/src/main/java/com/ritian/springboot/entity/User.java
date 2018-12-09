package com.ritian.springboot.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ritian.Zhang
 * @date 2018/12/06
 **/
@Data
@NoArgsConstructor
public class User {
    private Integer id;

    private String nickname;

    private Integer age;

    public User(String nickname,Integer age){
        this.nickname = nickname;
        this.age = age;
    }
}
