package com.ritian.mongodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ritian.Zhang
 * @date 2019/04/15
 **/
@Data
@NoArgsConstructor
@ToString
@Document(collection = "r_student")
public class Student {

    @Indexed
    private String id;

    private String stuNo;

    private String name;

    private Integer age;

    private Integer sex;

}
