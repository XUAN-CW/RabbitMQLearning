package com.example.producer.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMq 配置类
 */
@Configuration
public class RabbitMqConfig {
    public static final String SIMPLE_EXCHANGE_NAME = "simple_exchange";
    public static final String SIMPLE_QUEUE_NAME = "simple_queue";

    /**
     * 1/3. 创建交换机
     * @return
     */
    @Bean
    public Exchange simpleExchange(){
        return ExchangeBuilder.topicExchange(SIMPLE_EXCHANGE_NAME).build();
    }

    /**
     * 2/3. 创建队列
     * @return
     */
    @Bean
    public Queue simpleQueue(){
        return QueueBuilder.durable(SIMPLE_QUEUE_NAME).build();
    }

    /**
     * 3/3. 绑定交换机与队列
     * @param exchange
     * @param queue
     * @return
     */
    @Bean
    public Binding itemQueueExchange(@Qualifier("simpleExchange") Exchange exchange, @Qualifier("simpleQueue") Queue queue){
        return BindingBuilder.bind(queue).to(exchange).with("").noargs();
    }
}

