package com.example.producer.config;

import com.example.producer.constant.Number04_RoutingConstant;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
        return new DirectExchange(Number04_RoutingConstant.ROUTING_EXCHANGE);
    }

    @Bean
    public Queue directQueue(){
        return new Queue(Number04_RoutingConstant.ROUTING_QUEUE_01);
    }

    @Bean
    public Queue directQueue2(){
        return new Queue(Number04_RoutingConstant.ROUTING_QUEUE_02);
    }

    @Bean
    public Binding directBinding(){
        return BindingBuilder.bind(directQueue()).to(directExchange()).with(Number04_RoutingConstant.ROUTING_KEY_01);
    }

    @Bean
    public Binding directBinding2(){
        return BindingBuilder.bind(directQueue2()).to(directExchange()).with(Number04_RoutingConstant.ROUTING_KEY_02);
    }
}
