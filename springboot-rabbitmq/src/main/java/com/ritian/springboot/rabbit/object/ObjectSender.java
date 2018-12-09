package com.ritian.springboot.rabbit.object;

import com.ritian.springboot.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ObjectSender {

	@Resource
	private AmqpTemplate rabbitTemplate;

	public void send(User user) {
		System.out.println("Sender object: " + user.toString());
		this.rabbitTemplate.convertAndSend("object", user);

	}

}