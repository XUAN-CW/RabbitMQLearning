package com.example.consumer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jaymin
 * 2021/1/2 14:26
 */
@Configuration
public class DirectMQConfig {
    /**
     * 消息的routing key与队列的binding key相同的队列
     */
    public static final String DIRECT_QUEUE_NAME = "com.xjm.mq.direct";
    /**
     * direct 交换机
     */
    public static final String DIRECT_EXCHANGE_NAME = "com.xjm.mq.direct.exchange";
    /**
     * routing key
     */
    public static final String DIRECT_ROUTING_KEY_NAME = "com.xjm.mq.direct.routing.key";

}
