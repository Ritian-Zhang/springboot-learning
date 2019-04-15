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
@Document(collection = "users")
public class User {

    @Indexed
    private String userId;

    private String name;

    private String email;
}
