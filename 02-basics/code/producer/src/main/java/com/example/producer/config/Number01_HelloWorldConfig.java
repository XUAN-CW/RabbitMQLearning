package com.example.producer.config;

import com.example.producer.constant.Number01_HelloWorldConstant;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMq 配置类
 */
@Configuration
public class Number01_HelloWorldConfig {

    /**
     * 1/3. 创建交换机
     * @return
     */
    @Bean
    public Exchange simpleExchange(){
        return ExchangeBuilder.topicExchange(Number01_HelloWorldConstant.HELLO_WORLD_EXCHANGE).build();
    }

    /**
     * 2/3. 创建队列
     * @return
     */
    @Bean
    public Queue simpleQueue(){
        return QueueBuilder.durable(Number01_HelloWorldConstant.HELLO_WORLD_QUEUE).build();
    }

    /**
     * 3/3. 绑定交换机与队列
     * @return
     */
    @Bean
    public Binding itemQueueExchange(){
        return BindingBuilder.bind(simpleQueue()).to(simpleExchange()).with("").noargs();
    }
}

