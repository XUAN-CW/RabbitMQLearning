package com.example.consumer.listener;

import com.example.consumer.constant.Number05_TopicsConstant;
import org.springframework.amqp.rabbit.annotation.Queue;
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

    @RabbitListener(queuesToDeclare = @Queue(Number05_TopicsConstant.TOPIC_BOOKS_CHINESE))
    @RabbitHandler
    public void basketballReceiveMessage(String message) {
        System.out.println("05-通配符-转发到匹配的队列："+Number05_TopicsConstant.TOPIC_BOOKS_CHINESE+"收到了"+message);
    }

    @RabbitListener(queuesToDeclare = @Queue(Number05_TopicsConstant.TOPIC_BOOKS_ENGLISH))
    @RabbitHandler
    public void footballReceiveMessage(String message) {
        System.out.println("05-通配符-转发到匹配的队列："+Number05_TopicsConstant.TOPIC_BOOKS_ENGLISH+"收到了"+message);
    }

    @RabbitListener(queuesToDeclare = @Queue(Number05_TopicsConstant.TOPIC_SPORTS_BASKETBALL))
    @RabbitHandler
    public void bookReceiveMessage(String message) {
        System.out.println("05-通配符-转发到匹配的队列："+Number05_TopicsConstant.TOPIC_SPORTS_BASKETBALL+"收到了"+message);
    }

    @RabbitListener(queuesToDeclare = @Queue(Number05_TopicsConstant.TOPIC_SPORTS_FOOTBALL))
    @RabbitHandler
    public void bookReceiveMessage2(String message) {
        System.out.println("05-通配符-转发到匹配的队列："+Number05_TopicsConstant.TOPIC_SPORTS_FOOTBALL+"收到了"+message);
    }

}
