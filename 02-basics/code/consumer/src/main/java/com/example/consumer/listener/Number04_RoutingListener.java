package com.example.consumer.listener;

import com.example.consumer.constant.Number04_RoutingConstant;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author XUAN
 * @date 2021/4/29 - 18:11
 * @references
 * @purpose
 * @errors
 */
@Component
public class Number04_RoutingListener {
    @RabbitListener(queuesToDeclare = @Queue(Number04_RoutingConstant.ROUTING_QUEUE_01))
    @RabbitHandler
    public void receiveMessage(String message) {
        System.out.println("04-按 key 转发到队列:"+Number04_RoutingConstant.ROUTING_QUEUE_01+"收到了"+message);
    }

    @RabbitListener(queuesToDeclare = @Queue(Number04_RoutingConstant.ROUTING_QUEUE_02))
    @RabbitHandler
    public void receiveMessage2(String message) {
        System.out.println("04-按 key 转发到队列:"+Number04_RoutingConstant.ROUTING_QUEUE_02+"收到了"+message);
    }
}
