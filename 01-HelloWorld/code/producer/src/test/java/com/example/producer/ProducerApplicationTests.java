package com.example.producer;

import com.example.producer.config.FanoutMQConfig;
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
	
	@Test// worke queues 模型
	void test_work_queue() {
		for (int i = 0; i < 10; i++) {
			rabbitTemplate.convertAndSend("work", "worker 模型"+i);
		}
	}

	@Test
	void PublishOrSubscribe(){
		rabbitTemplate.convertAndSend(FanoutMQConfig.FANOUT_EXCHANGE_NAME, "", "Publish/Subscribe");

	}
}
