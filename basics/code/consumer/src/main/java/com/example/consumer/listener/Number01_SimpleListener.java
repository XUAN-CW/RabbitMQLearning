package com.example.consumer.listener;

import com.example.consumer.constant.Number01_SimpleConstant;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Number01_SimpleListener {
    /**
     * 监听某个队列的消息
     * @param message 接收到的消息
     */
    @RabbitListener(queues = Number01_SimpleConstant.SIMPLE_QUEUE_NAME)
    public void myListener(String message){
        System.out.println("消费者接收到的消息为:"+message);
    }
}

