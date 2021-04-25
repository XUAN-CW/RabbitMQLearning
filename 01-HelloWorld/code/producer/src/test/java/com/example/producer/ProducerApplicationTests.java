package com.example.producer;

import com.example.producer.config.DirectMQConfig;
import com.example.producer.config.FanoutMQConfig;
import com.example.producer.config.RabbitMqConfig;
import com.example.producer.config.TopicMQConfig;
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

	@Test
	void TopicsTest(){
		for (int i=0;i<5;i++){
			rabbitTemplate.convertAndSend(TopicMQConfig.TOPIC_EXCHANGE_NAME, TopicMQConfig.BOOK_TOPIC, "BOOK_TOPIC"+i);
			rabbitTemplate.convertAndSend(TopicMQConfig.TOPIC_EXCHANGE_NAME, TopicMQConfig.SPORTS_TOPIC, "SPORTS_TOPIC"+i);
			rabbitTemplate.convertAndSend(TopicMQConfig.TOPIC_EXCHANGE_NAME, TopicMQConfig.BASKETBALL_TOPIC_QUEUE_NAME, "BASKETBALL_TOPIC_QUEUE_NAME"+i);
			rabbitTemplate.convertAndSend(TopicMQConfig.TOPIC_EXCHANGE_NAME, TopicMQConfig.BOOK_TOPIC_QUEUE_NAME, "BOOK_TOPIC_QUEUE_NAME"+i);
			rabbitTemplate.convertAndSend(TopicMQConfig.TOPIC_EXCHANGE_NAME, TopicMQConfig.FOOTBALL_TOPIC_QUEUE_NAME, "FOOTBALL_TOPIC_QUEUE_NAME"+i);

		}
	}

	@Test
	void d(){
		rabbitTemplate.convertAndSend(DirectMQConfig.DIRECT_EXCHANGE_NAME, DirectMQConfig.DIRECT_ROUTING_KEY_NAME, "DIRECT_ROUTING_KEY_NAME");
	}

}
