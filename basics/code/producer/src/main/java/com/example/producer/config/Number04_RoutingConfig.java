package com.example.producer.config;

import com.example.producer.constant.Number04_RoutingConstant;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author XUAN
 * @date 2021/4/29 - 18:06
 * @references
 * @purpose
 * @errors
 */
@Configuration
public class Number04_RoutingConfig {

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange(Number04_RoutingConstant.DIRECT_EXCHANGE_NAME);
    }

    @Bean
    public Queue directQueue(){
        return new Queue(Number04_RoutingConstant.DIRECT_QUEUE_NAME);
    }

    @Bean
    public Binding directBinding(){
        return BindingBuilder.bind(directQueue()).to(directExchange()).with(Number04_RoutingConstant.DIRECT_ROUTING_KEY_NAME);
    }
}
