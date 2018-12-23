package com.ritian.springboot.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Id;

/**
 * user
 * <p> lombok @Accessors用法,chain为true 则setter方法返回当前对象</p>
 * @author ritian.Zhang
 * @date 2018/12/06
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    @Id
    private Integer id;

    private String nickname;

    private Integer age;

    public User(String nickname, Integer age){
        this.nickname = nickname;
        this.age = age;
    }
}
