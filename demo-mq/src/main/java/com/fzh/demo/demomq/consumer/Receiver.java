package com.fzh.demo.demomq.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private static final Logger log = LoggerFactory.getLogger(Receiver.class);

    @RabbitListener(queues = {"$mq.queue.name"})
    public void process(String msg){
        log.info("get msg:{}",msg);
    }
}
