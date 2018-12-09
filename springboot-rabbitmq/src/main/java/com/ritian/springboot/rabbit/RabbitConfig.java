package com.ritian.springboot.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 队列配置
 * @author ritian.Zhang
 * @date 2018/12/06
 **/
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

    @Bean
    public Queue ritianQueue() {
        return new Queue("ritian");
    }

    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }
}
