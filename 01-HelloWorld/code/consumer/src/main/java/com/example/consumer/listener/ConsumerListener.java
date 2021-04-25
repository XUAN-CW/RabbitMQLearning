package com.example.consumer.listener;

import com.example.consumer.config.FanoutMQConfig;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {
    /**
     * 监听某个队列的消息
     * @param message 接收到的消息
     */
    @RabbitListener(queues ="simple_queue")
    public void myListener(String message){
        System.out.println("消费者接收到的消息为:"+message);
    }

    ////////////////// worker //////////////////
    // worker 模型默认公平模型~
    @RabbitListener(queuesToDeclare=@Queue(value = "work"))
    private void receiveMsgWork1(String msg){
        System.out.println("worker_1:"+msg);
    }

    @RabbitListener(queuesToDeclare=@Queue(value = "work"))
    private void receiveMsgWork2(String msg){
        System.out.println("worker_2:"+msg);
    }

    /////////////////////////////////////////
    @RabbitListener(queues = {FanoutMQConfig.FIRST_FANOUT_QUEUE_NAME})
    @RabbitHandler
    public void firstReceiveMessage(String message) {
        System.out.println("firstReceiveMessage:"+message);
    }

    @RabbitListener(queues = {FanoutMQConfig.SECOND_FANOUT_QUEUE_NAME})
    @RabbitHandler
    public void secondReceiveMessage(String message) {
        System.out.println("secondReceiveMessage:"+message);
    }
}

