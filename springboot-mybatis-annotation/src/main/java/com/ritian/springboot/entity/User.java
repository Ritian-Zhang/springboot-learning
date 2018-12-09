package com.ritian.springboot.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ritian.Zhang
 * @date 2018/12/05
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
