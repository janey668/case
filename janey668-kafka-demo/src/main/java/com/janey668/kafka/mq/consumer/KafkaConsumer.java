package com.janey668.kafka.mq.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {

    /**
     * 指定要监听的 topic
     * @param msg
     */
    @KafkaListener(topics = "first_topic")
    public void consumeTopic(String msg) { // 参数: 收到的 value
        System.out.println("收到的信息: " + msg);
    }

}

