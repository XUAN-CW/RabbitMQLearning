package com.example.consumer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jaymin
 * 2021/1/2 15:12
 */
@Configuration
public class TopicMQConfig {
    /**
     * 体育主题的篮球队列
     */
    public static final String BASKETBALL_TOPIC_QUEUE_NAME = "com.xjm.mq.topic.sports.basketball";
    /**
     * 体育主题的足球队列
     */
    public static final String FOOTBALL_TOPIC_QUEUE_NAME = "com.xjm.mq.topic.sports.football";
    /**
     * 读书主题的阅读队列
     */
    public static final String BOOK_TOPIC_QUEUE_NAME = "com.xjm.mq.topic.book";
    /**
     * 主题交换机
     */
    public static final String TOPIC_EXCHANGE_NAME = "com.xjm.mq.topic.exchange";
    /**
     * 体育主题
     */
    public static final String SPORTS_TOPIC = "topic.sports.#";
    /**
     * 读书主题
     */
    public static final String BOOK_TOPIC = "topic.book.#";
}

