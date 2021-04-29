package com.example.producer.config;

import com.example.producer.constant.Number02_WorkQueuesConstant;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XUAN
 * @date 2021/4/29 - 17:19
 * @references
 * @purpose
 * @errors
 */
@Configuration
public class Number02_WorkQueuesConfig {

    /**
     * 1/3. 创建交换机
     * @return
     */
    @Bean
    public Exchange workQueuesExchange(){
        return ExchangeBuilder.topicExchange(Number02_WorkQueuesConstant.WORK_QUEUES_EXCHANGE_NAME).build();
    }

    /**
     * 2/3. 创建队列
     * @return
     */
    @Bean
    public Queue workQueuesQueue(){
        return QueueBuilder.durable(Number02_WorkQueuesConstant.WORK_QUEUES_QUEUE_NAME).build();
    }

    /**
     * 3/3. 绑定交换机与队列
     * @return
     */
    @Bean
    public Binding workQueuesBindingToExchange(){
        return BindingBuilder.bind(workQueuesQueue()).to(workQueuesExchange()).with("").noargs();
    }
}
