package com.fzh.demo.demomq.config;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {

    @Value("${mq.queue.name}")
    private String queueName;

    public Queue createQueue(){
        return new Queue(queueName);
    }
}
