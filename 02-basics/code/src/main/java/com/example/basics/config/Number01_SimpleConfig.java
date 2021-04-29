//package com.example.basics.config;
//
//import org.springframework.amqp.core.*;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * RabbitMq 配置类
// */
//@Configuration
//public class Number01_SimpleConfig {
//    public static final String SIMPLE_EXCHANGE_NAME = "Number01_Simple_exchange";
//    public static final String SIMPLE_QUEUE_NAME = "Number01_Simple_queue";
//
//    /**
//     * 1/3. 创建交换机
//     * @return
//     */
//    @Bean(name = SIMPLE_EXCHANGE_NAME)
//    public Exchange simpleExchange(){
//        return ExchangeBuilder.topicExchange(SIMPLE_EXCHANGE_NAME).build();
//    }
//
//    /**
//     * 2/3. 创建队列
//     * @return
//     */
//    @Bean(name = SIMPLE_QUEUE_NAME)
//    public Queue simpleQueue(){
//        return QueueBuilder.durable(SIMPLE_QUEUE_NAME).build();
//    }
//
//    /**
//     * 3/3. 绑定交换机与队列
//     * @param exchange
//     * @param queue
//     * @return
//     */
//    @Bean
//    public Binding SimpleBindingToExchange(@Qualifier(SIMPLE_EXCHANGE_NAME) Exchange exchange, @Qualifier(SIMPLE_QUEUE_NAME) Queue queue){
//        return BindingBuilder.bind(queue).to(exchange).with("").noargs();
//    }
//}
//
