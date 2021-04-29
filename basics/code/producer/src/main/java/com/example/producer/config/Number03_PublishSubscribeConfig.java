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
        return new FanoutExchange(Number03_PublishSubscribeConstant.FANOUT_EXCHANGE_NAME);
    }

    @Bean
    public Queue firstFanoutQueue() {
        return new Queue(Number03_PublishSubscribeConstant.FIRST_FANOUT_QUEUE_NAME);
    }

    @Bean
    public Queue secondFanoutQueue() {
        return new Queue(Number03_PublishSubscribeConstant.SECOND_FANOUT_QUEUE_NAME);
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
