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
	public void Number01_SimpleTest(){
		rabbitTemplate.convertAndSend(Number01_SimpleConstant.SIMPLE_EXCHANGE_NAME,"","HelloWorld");
	}

	@Test
	void Number02_WorkQueuesTest() {
		for (int i = 0; i < 10; i++) {
			rabbitTemplate.convertAndSend(Number02_WorkQueuesConstant.WORK_QUEUES_EXCHANGE_NAME,"", "worker 模型"+i);
		}
	}

	@Test
	void Number03_PublishOrSubscribeTest(){
		rabbitTemplate.convertAndSend(Number03_PublishSubscribeConstant.FANOUT_EXCHANGE_NAME, "", "Publish/Subscribe");

	}

	@Test
	void Number04__RoutingTest(){
		rabbitTemplate.convertAndSend(Number04_RoutingConstant.DIRECT_EXCHANGE_NAME, Number04_RoutingConstant.DIRECT_ROUTING_KEY_NAME, "DIRECT_ROUTING_KEY_NAME");
	}

	@Test
	void Number05_TopicsTest(){
		for (int i=0;i<5;i++){
			rabbitTemplate.convertAndSend(Number05_TopicsConstant.TOPIC_EXCHANGE_NAME, Number05_TopicsConstant.BOOK_TOPIC, "BOOK_TOPIC"+i);
			rabbitTemplate.convertAndSend(Number05_TopicsConstant.TOPIC_EXCHANGE_NAME, Number05_TopicsConstant.SPORTS_TOPIC, "SPORTS_TOPIC"+i);
			rabbitTemplate.convertAndSend(Number05_TopicsConstant.TOPIC_EXCHANGE_NAME, Number05_TopicsConstant.BASKETBALL_TOPIC_QUEUE_NAME, "BASKETBALL_TOPIC_QUEUE_NAME"+i);
			rabbitTemplate.convertAndSend(Number05_TopicsConstant.TOPIC_EXCHANGE_NAME, Number05_TopicsConstant.BOOK_TOPIC_QUEUE_NAME, "BOOK_TOPIC_QUEUE_NAME"+i);
			rabbitTemplate.convertAndSend(Number05_TopicsConstant.TOPIC_EXCHANGE_NAME, Number05_TopicsConstant.FOOTBALL_TOPIC_QUEUE_NAME, "FOOTBALL_TOPIC_QUEUE_NAME"+i);

		}
	}
}
