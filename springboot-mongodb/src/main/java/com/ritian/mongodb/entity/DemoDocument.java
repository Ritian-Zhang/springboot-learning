package com.ritian.mongodb.entity;

/**
 * @author ritian.Zhang
 * @date 2019/04/26
 **/

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@Builder
@Document(collection = "p_demo_document")
public class DemoDocument {
    private Long id;
    private String name;
    private String desc;
    private String createTime;
}
