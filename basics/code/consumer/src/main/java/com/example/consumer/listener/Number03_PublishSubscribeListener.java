package com.example.consumer.listener;

import com.example.consumer.constant.Number03_PublishSubscribeConstant;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author XUAN
 * @date 2021/4/29 - 18:03
 * @references
 * @purpose
 * @errors
 */
@Component
public class Number03_PublishSubscribeListener {

    @RabbitListener(queues = {Number03_PublishSubscribeConstant.FIRST_FANOUT_QUEUE_NAME})
    @RabbitHandler
    public void firstReceiveMessage(String message) {
        System.out.println("firstReceiveMessage:"+message);
    }

    @RabbitListener(queues = {Number03_PublishSubscribeConstant.SECOND_FANOUT_QUEUE_NAME})
    @RabbitHandler
    public void secondReceiveMessage(String message) {
        System.out.println("secondReceiveMessage:"+message);
    }

}