package com.example.consumer.listener;

import com.example.consumer.constant.Number02_WorkQueuesConstant;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @author XUAN
 * @date 2021/4/29 - 17:33
 * @references
 * @purpose
 * @errors
 */
@Component
public class Number02_WorkQueuesListener {

    // worker 模型默认公平模型
    @RabbitListener(queuesToDeclare=@Queue(value = Number02_WorkQueuesConstant.WORK_QUEUES_QUEUE))
    private void receiveMsgWork1(String msg){
        System.out.println("worker_1:"+msg);
    }

    @RabbitListener(queuesToDeclare=@Queue(value = Number02_WorkQueuesConstant.WORK_QUEUES_QUEUE))
    private void receiveMsgWork2(String msg){
        System.out.println("worker_2:"+msg);
    }
}
