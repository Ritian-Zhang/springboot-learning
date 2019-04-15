package com.ritian.kafka.receiver;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author ritian.Zhang
 * @date 2019/03/06
 **/
@Component
@Slf4j
public class KafkaReceiver {

    @KafkaListener(topics = {"topic1"})
    public void listen(ConsumerRecord<?,?> record){
        //判断是否为空
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if(kafkaMessage.isPresent()){
            Object message = kafkaMessage.get();
            log.info("record={}",record);
            log.info("message={}",message);
        }
    }
}
