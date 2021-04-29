package com.example.producer.constant;

/**
 * @author XUAN
 * @date 2021/4/29 - 21:50
 * @references
 * @purpose
 * @errors
 */
public class Number05_TopicsConstant {
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
