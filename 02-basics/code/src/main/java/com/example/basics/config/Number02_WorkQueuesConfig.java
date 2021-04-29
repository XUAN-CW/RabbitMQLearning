package com.example.basics.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XUAN
 * @date 2021/4/27 - 17:47
 * @references
 * @purpose
 * @errors
 */
@Configuration
public class Number02_WorkQueuesConfig {
    public static final String WORK_QUEUES_EXCHANGE_NAME = "Number02_WorkQueues_exchange";
    public static final String WORK_QUEUES_QUEUE_NAME = "Number02_WorkQueues_queue";

    /**
     * 1/3. 创建交换机
     * @return
     */
    @Bean(name = WORK_QUEUES_EXCHANGE_NAME)
    public Exchange workQueuesExchange(){
        return ExchangeBuilder.topicExchange(WORK_QUEUES_EXCHANGE_NAME).build();
    }

    /**
     * 2/3. 创建队列
     * @return
     */
    @Bean(name = WORK_QUEUES_QUEUE_NAME)
    public Queue workQueuesQueue(){
        return QueueBuilder.durable(WORK_QUEUES_QUEUE_NAME).build();
    }

    /**
     * 3/3. 绑定交换机与队列
     * @param exchange
     * @param queue
     * @return
     */
    @Bean
    public Binding workQueuesBindingToExchange(@Qualifier(WORK_QUEUES_EXCHANGE_NAME) Exchange exchange, @Qualifier(WORK_QUEUES_QUEUE_NAME) Queue queue){
        return BindingBuilder.bind(queue).to(exchange).with("").noargs();
    }
}
