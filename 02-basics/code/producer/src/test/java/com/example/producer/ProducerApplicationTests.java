package com.example.producer;

import com.example.producer.constant.*;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ProducerApplicationTests {

	@Resource
	private RabbitTemplate rabbitTemplate;

	@Test
	public void Number01_HelloWorldTest(){
		rabbitTemplate.convertAndSend(Number01_HelloWorldConstant.HELLO_WORLD_EXCHANGE,"","HelloWorld");
	}

	@Test
	void Number02_WorkQueuesTest() {
		for (int i = 0; i < 10; i++) {
			rabbitTemplate.convertAndSend(Number02_WorkQueuesConstant.WORK_QUEUES_EXCHANGE,"", "worker 模型"+i);
		}
	}

	@Test
	void Number03_PublishOrSubscribeTest(){
		rabbitTemplate.convertAndSend(Number03_PublishSubscribeConstant.PUBLISH_SUBSCRIBE_EXCHANGE, "", "Publish/Subscribe");

	}

	@Test
	void Number04__RoutingTest(){
		rabbitTemplate.convertAndSend(Number04_RoutingConstant.ROUTING_EXCHANGE, Number04_RoutingConstant.ROUTING_KEY_01, Number04_RoutingConstant.ROUTING_KEY_01);
		rabbitTemplate.convertAndSend(Number04_RoutingConstant.ROUTING_EXCHANGE, Number04_RoutingConstant.ROUTING_KEY_02, Number04_RoutingConstant.ROUTING_KEY_02);

	}

	@Test
	void Number05_TopicsTest(){
		rabbitTemplate.convertAndSend(Number05_TopicsConstant.TOPIC_EXCHANGE, Number05_TopicsConstant.TOPIC_BOOKS, Number05_TopicsConstant.TOPIC_BOOKS);
		rabbitTemplate.convertAndSend(Number05_TopicsConstant.TOPIC_EXCHANGE, Number05_TopicsConstant.TOPIC_SPORTS, Number05_TopicsConstant.TOPIC_SPORTS);
	}
}
