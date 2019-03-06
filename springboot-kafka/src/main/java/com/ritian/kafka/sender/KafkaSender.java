package com.ritian.kafka.sender;

import com.alibaba.fastjson.JSON;
import com.ritian.kafka.entity.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

/**
 * @author ritian.Zhang
 * @date 2019/03/06
 **/
@Slf4j
@Component
public class KafkaSender {
    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send() {
        Message message = Message.builder()
                .id(System.currentTimeMillis())
                .msg(UUID.randomUUID().toString())
                .sendTime(new Date())
                .build();
        kafkaTemplate.send("topic1",JSON.toJSONString(message));
    }

}
