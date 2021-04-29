package com.example.consumer.listener;

import com.example.consumer.constant.Number05_TopicsConstant;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

/**
 * @author XUAN
 * @date 2021/4/29 - 21:59
 * @references
 * @purpose
 * @errors
 */
@Configuration
public class Number05_TopicsListener {

    @RabbitListener(queues = {Number05_TopicsConstant.TOPIC_BOOKS_CHINESE})
    @RabbitHandler
    public void basketballReceiveMessage(String message) {
        System.out.println(Number05_TopicsConstant.TOPIC_BOOKS_CHINESE+message);
    }

    @RabbitListener(queues = {Number05_TopicsConstant.TOPIC_BOOKS_ENGLISH})
    @RabbitHandler
    public void footballReceiveMessage(String message) {
        System.out.println(Number05_TopicsConstant.TOPIC_BOOKS_ENGLISH+message);
    }

    @RabbitListener(queues = {Number05_TopicsConstant.TOPIC_SPORTS_BASKETBALL})
    @RabbitHandler
    public void bookReceiveMessage(String message) {
        System.out.println(Number05_TopicsConstant.TOPIC_SPORTS_BASKETBALL+message);
    }

    @RabbitListener(queues = {Number05_TopicsConstant.TOPIC_SPORTS_FOOTBALL})
    @RabbitHandler
    public void bookReceiveMessage2(String message) {
        System.out.println(Number05_TopicsConstant.TOPIC_SPORTS_FOOTBALL+message);
    }

}
