package com.example.producer.config;

import com.example.producer.constant.Number05_TopicsConstant;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XUAN
 * @date 2021/4/29 - 21:51
 * @references
 * @purpose
 * @errors
 */
@Configuration
public class Number05_TopicsConfig {

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(Number05_TopicsConstant.TOPIC_EXCHANGE_NAME);
    }

    @Bean
    public Queue basketBallQueue() {
        return new Queue(Number05_TopicsConstant.BASKETBALL_TOPIC_QUEUE_NAME);
    }

    @Bean
    public Queue footBallQueue() {
        return new Queue(Number05_TopicsConstant.FOOTBALL_TOPIC_QUEUE_NAME);
    }

    @Bean
    public Queue bookQueue() {
        return new Queue(Number05_TopicsConstant.BOOK_TOPIC_QUEUE_NAME);
    }

    @Bean
    public Binding basketBallBinding() {
        return BindingBuilder.bind(basketBallQueue()).to(topicExchange()).with(Number05_TopicsConstant.SPORTS_TOPIC);
    }

    @Bean
    public Binding footBallBinding() {
        return BindingBuilder.bind(footBallQueue()).to(topicExchange()).with(Number05_TopicsConstant.SPORTS_TOPIC);
    }

    @Bean
    public Binding bookBinding() {
        return BindingBuilder.bind(bookQueue()).to(topicExchange()).with(Number05_TopicsConstant.BOOK_TOPIC);
    }
}
