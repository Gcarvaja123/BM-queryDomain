package com.tps.demo.rabbitmq;

import com.tps.demo.DemoApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Sender {


    private final RabbitTemplate rabbitTemplate;

    public Sender(final RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Scheduled(fixedDelay = 30000L)
    public void sendPracticalTip() {
        rabbitTemplate.convertAndSend(DemoApplication.EXCHANGE_NAME, DemoApplication.ROUTING_KEY, "sick");
       
    }
}
