package com.example.producer.constant;

/**
 * @author XUAN
 * @date 2021/4/29 - 17:45
 * @references
 * @purpose
 * @errors
 */
public class Number03_PublishSubscribeConstant {
    /**
     * 与fanout绑定的第一个队列
     */
    public static final String FIRST_FANOUT_QUEUE_NAME = "com.xjm.mq.fanout.first";
    /**
     * 与fanout交换机绑定的第二个队列
     */
    public static final String SECOND_FANOUT_QUEUE_NAME = "com.xjm.mq.fanout.second";
    /**
     * fanout 交换机
     */
    public static final String FANOUT_EXCHANGE_NAME = "com.xjm.mq.fanout.exchange";
}
