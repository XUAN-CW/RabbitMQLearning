package com.example.basics;

//import com.example.basics.config.Number01_SimpleConfig;
//import com.example.basics.config.Number02_WorkQueuesConfig;
import com.example.basics.config.Number02_WorkQueuesConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BasicsApplicationTests {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @Test
    public void Number1_SimpleTest(){
        rabbitTemplate.convertAndSend("Number01_Simple_exchange","","simple");
    }

    @Test
    void Number02_WorkQueuesTest() {
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend("Number02_WorkQueues_exchange","", "worker 模型"+i);
        }
    }


}
