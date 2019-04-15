package com.ritian.kafka.entity;

import lombok.*;

import java.util.Date;

/**
 * @author ritian.Zhang
 * @date 2019/03/06
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {

    private Long id;

    private String msg;

    private Date sendTime;
}
