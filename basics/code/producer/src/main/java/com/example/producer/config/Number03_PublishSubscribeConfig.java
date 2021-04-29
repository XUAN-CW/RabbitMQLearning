package com.example.producer.config;

import com.example.producer.constant.Number03_PublishSubscribeConstant;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XUAN
 * @date 2021/4/29 - 17:45
 * @references
 * @purpose
 * @errors
 */
@Configuration
public class Number03_PublishSubscribeConfig {

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(Number03_PublishSubscribeConstant.PUBLISH_SUBSCRIBE_EXCHANGE);
    }

    @Bean
    public Queue firstFanoutQueue() {
        return new Queue(Number03_PublishSubscribeConstant.PUBLISH_SUBSCRIBE_QUEUE_01);
    }

    @Bean
    public Queue secondFanoutQueue() {
        return new Queue(Number03_PublishSubscribeConstant.PUBLISH_SUBSCRIBE_QUEUE_02);
    }

    @Bean
    public Binding firstFanoutBinding() {
        return BindingBuilder.bind(firstFanoutQueue()).to(fanoutExchange());
    }

    @Bean
    public Binding secondFanoutBinding() {
        return BindingBuilder.bind(secondFanoutQueue()).to(fanoutExchange());
    }
}
