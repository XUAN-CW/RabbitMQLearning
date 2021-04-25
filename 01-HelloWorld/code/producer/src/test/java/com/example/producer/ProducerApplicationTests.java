package com.example.producer;

import com.example.producer.config.RabbitMqConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ProducerApplicationTests {

	@Resource
	private RabbitTemplate rabbitTemplate;

	@Test
	public void simpleTest(){
		rabbitTemplate.convertAndSend(RabbitMqConfig.SIMPLE_EXCHANGE_NAME,"","simple");
	}

}
