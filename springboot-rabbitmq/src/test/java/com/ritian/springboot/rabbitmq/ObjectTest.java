package com.ritian.springboot.rabbitmq;

import com.ritian.springboot.model.User;
import com.ritian.springboot.rabbit.object.ObjectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectTest {

	@Autowired
	private ObjectSender objectsender;

	@Test
	public void sendOject() throws Exception {
		User user=new User();
		user.setUsername("ritian");
		user.setPassword("123456");
		objectsender.send(user);
	}

}