package com.example.consumer.listener;

import com.example.consumer.constant.Number01_HelloWorldConstant;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Number01_HelloWorldListener {
    /**
     * 监听某个队列的消息
     * @param message 接收到的消息
     */
    @RabbitListener(queuesToDeclare = @Queue(Number01_HelloWorldConstant.HELLO_WORLD_QUEUE))
    public void myListener(String message){
        System.out.println("01-直接接收："+message);
    }
}

