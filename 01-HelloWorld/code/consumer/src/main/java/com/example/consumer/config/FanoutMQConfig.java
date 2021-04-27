package com.example.consumer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author jaymin<br>
 * fanout:订阅交换机,可以实现发布订阅模式的消费模型<br>
 * 2021/1/2 14:52
 */
@Configuration
public class FanoutMQConfig {
    /**
     * 与fanout绑定的第一个队列
     */
    public static final String FIRST_FANOUT_QUEUE_NAME = "com.xjm.mq.fanout.first";
    /**
     * 与fanout交换机绑定的第二个队列
     */
    public static final String SECOND_FANOUT_QUEUE_NAME = "com.xjm.mq.fanout.second";
    /**
     * fanout 交换机
     */
    public static final String FANOUT_EXCHANGE_NAME = "com.xjm.mq.fanout.exchange";

}
