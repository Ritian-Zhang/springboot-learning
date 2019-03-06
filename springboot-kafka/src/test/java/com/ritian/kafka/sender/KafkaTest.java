package com.ritian.kafka.sender;

import com.ritian.kafka.ApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ritian.Zhang
 * @date 2019/03/06
 **/
public class KafkaTest extends ApplicationTests {
    @Autowired
    KafkaSender kafkaSender;

    @Test
    public void test() {
        for (int i = 0; i < 5; i++) {
            kafkaSender.send();
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
