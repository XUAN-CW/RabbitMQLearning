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
        return new TopicExchange(Number05_TopicsConstant.TOPIC_EXCHANGE);
    }

    @Bean
    public Queue basketBallQueue() {
        return new Queue(Number05_TopicsConstant.TOPIC_SPORTS_BASKETBALL);
    }

    @Bean
    public Queue footBallQueue() {
        return new Queue(Number05_TopicsConstant.TOPIC_SPORTS_FOOTBALL);
    }

    @Bean
    public Queue englishBookQueue() {
        return new Queue(Number05_TopicsConstant.TOPIC_BOOKS_ENGLISH);
    }

    @Bean
    public Queue cBookQueue() {
        return new Queue(Number05_TopicsConstant.TOPIC_BOOKS_CHINESE);
    }


    @Bean
    public Binding basketBallBinding() {
        return BindingBuilder.bind(basketBallQueue()).to(topicExchange()).with(Number05_TopicsConstant.TOPIC_SPORTS);
    }

    @Bean
    public Binding footBallBinding() {
        return BindingBuilder.bind(footBallQueue()).to(topicExchange()).with(Number05_TopicsConstant.TOPIC_SPORTS);
    }

    @Bean
    public Binding bookBinding() {
        return BindingBuilder.bind(englishBookQueue()).to(topicExchange()).with(Number05_TopicsConstant.TOPIC_BOOKS);
    }

    @Bean
    public Binding bookBinding2() {
        return BindingBuilder.bind(cBookQueue()).to(topicExchange()).with(Number05_TopicsConstant.TOPIC_BOOKS);
    }
}
