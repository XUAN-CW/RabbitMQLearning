package com.example.basics.listener;

import com.example.basics.config.Number02_WorkQueuesConfig;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

/**
 * @author XUAN
 * @date 2021/4/27 - 17:57
 * @references
 * @purpose
 * @errors
 */
@Configuration
public class Number02_WorkQueuesListener {

    // worker 模型默认公平模型
    @RabbitListener(queuesToDeclare=@Queue(value = Number02_WorkQueuesConfig.WORK_QUEUES_QUEUE_NAME))
//    @RabbitListener(queues = Number02_WorkQueuesConfig.WORK_QUEUES_QUEUE_NAME)
    private void receiveMsgWork1(String msg){
        System.out.println("worker_1:"+msg);
    }

//    @RabbitListener(queuesToDeclare=@Queue(value = "work"))
//    @RabbitListener(queues = Number02_WorkQueuesConfig.WORK_QUEUES_QUEUE)
    @RabbitListener(queuesToDeclare=@Queue(value = Number02_WorkQueuesConfig.WORK_QUEUES_QUEUE_NAME))
    private void receiveMsgWork2(String msg){
        System.out.println("worker_2:"+msg);
    }
}
