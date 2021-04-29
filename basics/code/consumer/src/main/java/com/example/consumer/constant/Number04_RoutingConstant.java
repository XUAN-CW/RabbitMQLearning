package com.example.consumer.constant;

/**
 * @author XUAN
 * @date 2021/4/29 - 18:06
 * @references
 * @purpose
 * @errors
 */
public class Number04_RoutingConstant {

    /**
     * 消息的routing key与队列的binding key相同的队列
     */
    public static final String DIRECT_QUEUE_NAME = "com.xjm.mq.direct";
    /**
     * direct 交换机
     */
    public static final String DIRECT_EXCHANGE_NAME = "com.xjm.mq.direct.exchange";
    /**
     * routing key
     */
    public static final String DIRECT_ROUTING_KEY_NAME = "com.xjm.mq.direct.routing.key";

}
