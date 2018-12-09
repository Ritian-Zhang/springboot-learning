package com.ritian.springboot.rabbit.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ritian.Zhang
 * @date 2018/12/06
 **/
@Component
public class FanoutSender {

    @Resource
    private AmqpTemplate rabbitTemplate;

    /**
     * 单发送多接收
     */
    public void send(){
        String context = "hi, fanout msg";
        System.out.println("Sender :"+context);
        this.rabbitTemplate.convertAndSend("fanoutExchange","",context);
    }
}
