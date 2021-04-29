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

    @RabbitListener(queues = {Number05_TopicsConstant.BASKETBALL_TOPIC_QUEUE_NAME})
    @RabbitHandler
    public void basketballReceiveMessage(String message) {
        System.out.println("basketballReceiveMessage:"+message);
    }

    @RabbitListener(queues = {Number05_TopicsConstant.FOOTBALL_TOPIC_QUEUE_NAME})
    @RabbitHandler
    public void footballReceiveMessage(String message) {
        System.out.println("footballReceiveMessage:"+message);
    }

    @RabbitListener(queues = {Number05_TopicsConstant.BOOK_TOPIC_QUEUE_NAME})
    @RabbitHandler
    public void bookReceiveMessage(String message) {
        System.out.println("bookReceiveMessage:"+message);
    }

}
